import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int n;
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new boolean[n][n];

        int a,b;
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken())-1;
            b = Integer.parseInt(st.nextToken())-1;
            graph[a][b]=true;
            graph[b][a]=true;
        }

        visited = new boolean[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            dfs(i);
            cnt++;
        }
        System.out.print(cnt);
    }
    void dfs(int x){
        visited[x] = true;
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            if(!graph[x][i]) continue;
            dfs(i);
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}