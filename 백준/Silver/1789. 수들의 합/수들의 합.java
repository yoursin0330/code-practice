import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long i=1;
        while(n>=0){
            n-=i++;
        }
        System.out.println(i-2);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}