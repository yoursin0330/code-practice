import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws Exception{
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,1,-1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m= Integer.parseInt(st.nextToken());
        char[][] map = new char[n][m];
        Queue<int[]> queue = new ArrayDeque<>();
        char[] tmp;
        for(int i=0;i<n;i++){
            tmp = br.readLine().toCharArray();
            for(int j=0;j<m;j++){
                map[i][j] = tmp[j];
                if(tmp[j]=='I'){
                    queue.add(new int[]{i,j});
                    map[i][j]='V'; //visited;
                }
            }
        }
        int cnt=0;

        int[] p;
        int nx, ny;
        while(!queue.isEmpty()){
            p = queue.poll();
            for (int i = 0; i < 4; i++) {
                nx = p[0] + dx[i];
                ny = p[1] + dy[i];
                if (nx < n && nx > -1 && ny < m && ny > -1 && map[nx][ny] != 'X' && map[nx][ny] != 'V') {
                    queue.add(new int[]{nx, ny});
                    if(map[nx][ny]=='P') cnt++;
                    map[nx][ny]='V';
                }
            }
        }
        System.out.print(cnt==0?"TT":cnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}