import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((int)br.readLine().toCharArray()[0]);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
