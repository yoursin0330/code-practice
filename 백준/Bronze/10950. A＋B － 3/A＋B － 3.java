import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}
