import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] times = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(times);
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.multiplyExact(times[i], n-i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}