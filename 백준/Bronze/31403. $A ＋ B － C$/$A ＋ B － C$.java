import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c));
        System.out.println(Integer.parseInt(a+b)-Integer.parseInt(c));
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}