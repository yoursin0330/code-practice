import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            queue.addLast(i);
        }
        while(queue.size()>1){
            queue.removeFirst();
            if(queue.size()==1) break;
            queue.addLast(queue.removeFirst());
        }
        System.out.print(queue.getFirst());
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}