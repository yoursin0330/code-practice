import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        System.out.println(chars[Integer.parseInt(br.readLine())-1]);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}