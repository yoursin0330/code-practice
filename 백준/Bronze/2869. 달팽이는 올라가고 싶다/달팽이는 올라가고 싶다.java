import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        System.out.println((int)(Math.ceil((double)(arr[2]-arr[0])/(arr[0]-arr[1])))+1);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}