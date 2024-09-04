import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            switch(s){
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if(stack.empty()) sb.append(-1).append('\n');
                    else sb.append(stack.pop()).append('\n');
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    sb.append((stack.empty())?1:0).append('\n');
                    break;
                case 5:
                    if(stack.empty()) sb.append(-1).append('\n');
                    else sb.append(stack.peek()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}