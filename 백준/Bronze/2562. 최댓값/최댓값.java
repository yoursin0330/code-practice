import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx=0;
        int max=0;
        for(int i=1;i<=9;i++){
            int x = Integer.parseInt(br.readLine());
            if(max<x){
                max=x;
                idx=i;
            }
        }
        System.out.print(max+"\n"+idx);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}