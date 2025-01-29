import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(Integer.parseInt(br.readLine()));
        }
        int coinCnt = 0;
        while(k>0){
            int maxCoin = stack.pop();
            coinCnt+=k/maxCoin;
            k%=maxCoin;
        }
        System.out.print(coinCnt);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}