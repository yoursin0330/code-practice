import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] arr = new int[100001];
        Deque<int[]> deque = new ArrayDeque<>(); //위치, 시간
        deque.push(new int[]{n,0});
        int[] now;
        while(!deque.isEmpty()){
            now = deque.removeFirst();
            if(now[0]==k){
                System.out.print(now[1]);
                break;
            }
            else if(now[0]<100001 && now[0]>-1 &&(arr[now[0]]==0 || arr[now[0]]>now[1])) {
                arr[now[0]] = now[1];
                deque.addLast(new int[]{now[0] + 1, now[1] + 1});
                deque.addLast(new int[]{now[0] - 1, now[1] + 1});
                if(2*now[0]<100001)
                    deque.addLast(new int[]{2*now[0], now[1] + 1});
            }
        }
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}