import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        int ans1 = 1;
        int idx = ans1;
        while(idx<=Math.min(a,b)){
            if(a%idx==0 && b%idx==0){
                ans1=idx;
            }
            idx++;
        }
        System.out.println(ans1);
        System.out.println((a/ans1)*b);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}