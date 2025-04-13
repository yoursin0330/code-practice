import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())/10;
        switch (n){
            case 8:
                System.out.println("B");break;
            case 7 :
                System.out.println("C");break;
            case 6:
                System.out.println("D");break;
            case 9:case 10:
                System.out.println("A");break;
            default:
                System.out.println("F");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
