import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {-1, 0, 1, 0};

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        char[][] map = new char[m][n];

        for (int i=0;i<m;i++){
            map[i] = br.readLine().toCharArray();
        }
        int answer = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (map[i][j] == 'L'){
                    answer = Math.max(bfs(map, m, n, i,j), answer);
                }
            }
        }
        System.out.println(answer);
    }

    public int bfs(char[][] map, int ylen, int xlen, int y, int x){
        int maxDist = 0;

        int[][] visited = new int[ylen][xlen];
        for(int[] row : visited){ Arrays.fill(row, -1);}
        visited[y][x] = 0;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y,x});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            for (int i=0;i<4;i++){
                int newY = cur[0] + dy[i];
                int newX = cur[1] + dx[i];

                if(newY>=0 && newY<ylen && newX>=0 && newX<xlen && map[newY][newX]=='L'&&visited[newY][newX]==-1){
                    visited[newY][newX] = visited[cur[0]][cur[1]] + 1;
                    maxDist = Math.max(maxDist, visited[newY][newX]);
                    q.add(new int[]{newY,newX});
                }
            }
        }
        return maxDist;
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}