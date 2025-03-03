import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int maxNum=0;
        int[] nums = new int[n];
        int x;
        for(int i=0;i<n;i++) nums[i] = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            x = nums[i];
            if(maxNum<x){
                for(int k=maxNum+1;k<=x;k++){
                    stack.push(k);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
                maxNum=x;
            }
            else if(stack.peek()==x){
                stack.pop();
                sb.append("-\n");
            }
            else{
                sb = new StringBuilder("NO");
                break;
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}