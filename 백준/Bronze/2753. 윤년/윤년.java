import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n%400==0 ||(n%4==0 &&n%100!=0)) System.out.println(1);
        else System.out.println(0);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
