import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    char[][] map;
    int n,m;
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int maxLen = Math.min(n,m);
        map = new char[n][m];
        for(int i=0;i<n;i++) map[i] = br.readLine().toCharArray();
        int len;
        for(len=maxLen;len>1;len--){
            if(check(len-1)) break;
        }
        System.out.print(len*len);
    }
    boolean check(int len){ // 해당 길이 정사각형 되는지
        for(int i=0;i<n-len;i++){
            for(int j=0;j<m-len;j++)
                if(map[i][j]==map[i][j+len]&&map[i][j]==map[i+len][j]&&map[i][j]==map[i+len][j+len])
                    return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
