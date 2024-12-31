import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bag5kgCnt = n/5;
        while(bag5kgCnt > -1){
            if ((n-bag5kgCnt*5)%3==0) {
                System.out.println(bag5kgCnt + (n - bag5kgCnt * 5) / 3);
                return;
            }
            else bag5kgCnt--;
        }
        System.out.println(-1);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}