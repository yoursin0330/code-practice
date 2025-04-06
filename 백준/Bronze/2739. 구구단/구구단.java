import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=9;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}
