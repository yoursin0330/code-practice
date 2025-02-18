import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[n];
        for(int i=0;i<n-1;i++){ // A
            for(int j=i+1;j<n;j++){ // B
                boolean seen = true;
                for(int k=i+1;k<j;k++){ // 시야 확인용 A, B 빌딩 사이 체크
                    if ((long)(arr[j] - arr[i]) * (k - i) <= (long)(arr[k] - arr[i]) * (j - i)){
                        seen = false;
                        break;
                    }
                }
                if(seen){
                    cnt[j]++;
                    cnt[i]++;
                }
            }
        }
        int maxSum = 0;
        for (int x: cnt) maxSum = Math.max(maxSum,x);
        System.out.print(maxSum);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}