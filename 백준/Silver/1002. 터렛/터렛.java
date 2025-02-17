import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            long[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToLong(Long::parseLong).toArray();

            long d = (arr[3] - arr[0]) * (arr[3] - arr[0]) + (arr[4] - arr[1]) * (arr[4] - arr[1]);
            long r1 = arr[2], r2 = arr[5];

            if (d == 0) { // 중심이 같은 경우
                if (r1 == r2) sb.append("-1\n"); // 동일한 원
                else sb.append("0\n"); // 반지름이 다르면 만나지 않음
            } else {
                long sumSquared = (r1 + r2) * (r1 + r2);
                long diffSquared = (r1 - r2) * (r1 - r2);

                if (d == sumSquared || d == diffSquared) sb.append("1\n"); // 외접 or 내접
                else if (diffSquared > d) sb.append("0\n"); // 한 원이 다른 원 내부에 포함
                else if (sumSquared > d) sb.append("2\n"); // 두 점에서 만남
                else sb.append("0\n"); // 원이 떨어져 있음
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
