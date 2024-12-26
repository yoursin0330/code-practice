import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        long answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i< k; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0) answer-=stack.pop();
            else{
                answer+=x;
                stack.push(x);
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}