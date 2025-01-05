import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    static int cnt;
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<int[]> queue = new ArrayDeque<>();
        int x = Integer.parseInt(br.readLine());
        cnt=x;
        dfs(x, 0);
        System.out.println(cnt);
    }
    public void dfs(int x, int currCnt){
        if(x==1){
            if(cnt>currCnt) cnt = currCnt;
            return;
        }
        if(x>=3){
            dfs(x/3, currCnt+x%3+1);
        }
        if(x>=2){
            dfs(x/2, currCnt+x%2+1);
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}