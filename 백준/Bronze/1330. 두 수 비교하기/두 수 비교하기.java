import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a==b) System.out.println("==");
        else if(a>b) System.out.println(">");
        else System.out.println("<");
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}

