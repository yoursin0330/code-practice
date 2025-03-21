import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] dx = new int[]{1,-1,0,0};
    static int[] dy = new int[]{0,0,1,-1};
    static char[][] map;
    static boolean [][] visited;
    static int n;

    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new char[n][n];
        for(int i=0;i<n;i++){
            map[i] = br.readLine().toCharArray();
        }

        System.out.print(checkArea());

        //적록색약용 맵
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]=='G') map[i][j]='R';
            }
        }
        System.out.print(" "+checkArea());
    }
    int checkArea(){
        visited = new boolean[n][n];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    cnt++;
                    visited[i][j]=true;
                    dfs(i,j);
                }
            }
        }
        return cnt;
    }
    void dfs(int x, int y){
        int nx, ny;
        for(int i=0;i<4;i++){
            nx = x+dx[i];
            ny = y+dy[i];
            if(nx < n && nx > -1 && ny < n && ny > -1&&!visited[nx][ny] && map[x][y]==map[nx][ny]){
                visited[nx][ny]=true;
                dfs(nx,ny);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}