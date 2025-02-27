import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int sum = 0;
        int tmp;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            tmp = Integer.parseInt(st.nextToken());
            max = Math.max(max, tmp);
            sum+=tmp;
        }
        System.out.println((double)sum/n/max*100);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}