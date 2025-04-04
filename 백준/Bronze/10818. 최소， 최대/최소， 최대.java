import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int min=x;
        int max=x;
        for(int i=1;i<n;i++){
            x = Integer.parseInt(st.nextToken());
            if(max<x) max=x;
            if(min>x) min=x;
        }
        System.out.print(min+" "+max);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}