import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())-1;
        if (n==0){
            System.out.print(1);
            return;
        }
        int c = 0;
        while(n > 0){
            if(n>++c*6){
                n-=c*6;
            }
            else{
                System.out.print(c+1);
                return;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}