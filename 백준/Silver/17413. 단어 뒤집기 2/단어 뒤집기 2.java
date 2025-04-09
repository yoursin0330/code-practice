import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static int n;
    int[][] nums;
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] chars = br.readLine().toCharArray();
        int tagStart=-1, tagEnd=-1;
        int tagCnt=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='<'){
                tagCnt++;
                for(int j=i-1;j>tagEnd;j--){
                    sb.append(chars[j]);
                }
                tagStart=i;
            }
            else if(chars[i]=='>'){
                tagCnt--;
                tagEnd=i;
                for(int j=tagStart;j<=tagEnd;j++){
                    sb.append(chars[j]);
                }
            }
            else if(chars[i]==' ' && tagCnt==0){
                for(int j=i-1;j>tagEnd;j--){
                    sb.append(chars[j]);
                }
                sb.append(" ");
                tagEnd = i;
            }
        }
        for(int i=chars.length-1;i>tagEnd;i--){
            sb.append(chars[i]);
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
