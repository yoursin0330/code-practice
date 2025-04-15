import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(m<45){
            h=(h+23)%24;
            m=(m+15)%60;
        }else m-=45;
        System.out.print(h+" "+m);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
