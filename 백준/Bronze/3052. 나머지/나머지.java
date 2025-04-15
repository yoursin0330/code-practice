import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<10;i++){
            map.put(Integer.parseInt(br.readLine())%42, true);
        }
        System.out.println(map.size());
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
