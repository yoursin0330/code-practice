import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int n = Integer.parseInt(br.readLine());
        char[] nums = br.readLine().toCharArray();
        for(int i=0;i<n;i++) sum+=nums[i]-'0';
        System.out.print(sum);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}