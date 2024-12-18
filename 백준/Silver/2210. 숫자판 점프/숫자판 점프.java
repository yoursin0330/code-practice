import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {-1, 0, 1, 0};
    static Set numbers = new HashSet();

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[5][5];

        for (int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int num = arr[i][j];
                dfs(arr, num, 1, i, j);
            }
        }
        System.out.println(numbers.size());
    }

    void dfs(int[][] arr,int num, int cnt, int y, int x){
        if (cnt == 6){
            numbers.add(num);
            return;
        }
        for(int z=0;z<4;z++){
            if (y+dy[z] > -1 && y+dy[z] < 5 && x+dx[z] > -1 && x+dx[z] < 5){
                int ny = y+dy[z], nx = x+dx[z];
                dfs(arr, num*10 + arr[ny][nx], cnt+1, ny, nx);
            }
        }
        return;
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}