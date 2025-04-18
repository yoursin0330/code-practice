import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] cnt = new int[10];
        for(char ch:String.valueOf(a*b*c).toCharArray()){
            cnt[ch-'0']++;
        }
        for(int x:cnt) System.out.println(x);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}