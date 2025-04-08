import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static int n;
    int[][] nums;
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        StringBuilder sb = new StringBuilder();
        nums = new int[n][n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine()); //입력
            for(int j=0;j<n;j++)
                nums[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] res;
        res = pow(nums,b);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) sb.append(res[i][j]%1000).append(" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }

    int[][] pow(int[][] matrix, long exp){
        if(exp == 1) return matrix;

        int[][] half = pow(matrix, exp/2);
        int[][] res = multiply(half,half);

        if(exp%2==1){
            res = multiply(res, nums);
        }

        return res;
    }
    int[][] multiply(int[][] a, int[][] b){
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                for (int k = 0; k < n; k++)
                    res[i][j] += (a[i][k] * b[k][j]) % 1000;
                res[i][j]%=1000;
            }
        }
        return res;
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}
