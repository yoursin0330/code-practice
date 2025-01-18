import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken()); // 가로
            int n = Integer.parseInt(st.nextToken()); // 세로
            int k = Integer.parseInt(st.nextToken()); // 배추 개수
            int[][] map = new int[m][n];
            for(int j=0;j<k;j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            int cnt = bfs(map);
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
    public int bfs(int[][] map){
        int cnt = 0;
        int[][] moves = {{0,1},{1,0},{0,-1},{-1,0}};
        int lx = map.length, ly = map[0].length;
        Deque<int[]> stack = new ArrayDeque();
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(map[i][j]==1){
                    stack.addFirst(new int[]{i, j});
                    map[i][j] = -1;
                    cnt++;
                    while(!stack.isEmpty()){
                        int[] point = stack.pop();
                        for(int[] mv:moves){
                            int nx = point[0]+mv[0], ny = point[1]+mv[1];
                            if(nx>-1&&ny>-1&&nx<lx&&ny<ly && map[nx][ny]==1){
                                stack.addFirst(new int[]{nx, ny});
                                map[nx][ny] = -1;
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}