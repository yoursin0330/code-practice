import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.print(a+b+"\n"+(a-b)+"\n"+a*b+"\n"+a/b+"\n"+a%b);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}

