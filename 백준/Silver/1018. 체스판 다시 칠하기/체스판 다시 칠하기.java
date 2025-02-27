import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        char[][] check = new char[8][8];
        check[0]=check[2]=check[4]=check[6] = "WBWBWBWB".toCharArray();
        check[1]=check[3]=check[5]=check[7] = "BWBWBWBW".toCharArray();
        for(int i=0;i<n;i++){
            board[i] = br.readLine().toCharArray();
        }
        int cnt = 64;
        for(int s_i=0;s_i<=n-8;s_i++){
            for(int s_j=0;s_j<=m-8;s_j++){
                int tmp = 0;
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if(check[i][j]!=board[i+s_i][j+s_j]) tmp++;
                    }
                }
                cnt = Math.min(cnt, Math.min(64-tmp, tmp));
            }
        }
        System.out.print(cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}