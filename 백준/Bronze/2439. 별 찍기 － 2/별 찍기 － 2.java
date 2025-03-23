import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int j=0;
            for(;j<n-i-1;j++) System.out.print(" ");
            for(;j<n;j++) System.out.print("*");
            System.out.println();
        }

    }


    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}