import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int x: Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray()){
            map.put(x, true);
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int x: Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray()){
            sb.append(map.containsKey(x)? "1 " : "0 ");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}