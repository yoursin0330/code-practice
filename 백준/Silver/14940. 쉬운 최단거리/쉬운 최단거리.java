import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public void solution() throws Exception{
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,1,-1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m= Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new ArrayDeque<>();
        int x;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                x = Integer.parseInt(st.nextToken());
                if(x==2){
                    queue.add(new int[]{i,j, -1}); //목표 지점
                    visited[i][j]=true;
                }else if(x==1) map[i][j]=-1;
                else map[i][j]=x;
            }
        }
        int[] p;
        int nx, ny;
        while(!queue.isEmpty()){
            p = queue.poll();
            map[p[0]][p[1]] = ++p[2];
            for (int i = 0; i < 4; i++) {
                nx = p[0] + dx[i];
                ny = p[1] + dy[i];
                if (nx < n && nx > -1 && ny < m && ny > -1 && map[nx][ny] != 0 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny, p[2]});
                    visited[nx][ny]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sb.append(map[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}