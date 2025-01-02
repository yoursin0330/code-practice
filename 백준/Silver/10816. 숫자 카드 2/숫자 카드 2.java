import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cardCnt = new HashMap<>();
        for(int num:Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray()){
            cardCnt.put(num,cardCnt.getOrDefault(num,0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int num:Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray()){
            sb.append(cardCnt.getOrDefault(num,0)+" ");
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}