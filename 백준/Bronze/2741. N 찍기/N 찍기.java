import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
