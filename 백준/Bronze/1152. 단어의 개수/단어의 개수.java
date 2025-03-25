import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        System.out.print(str.equals("")?0:str.split(" ").length);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}