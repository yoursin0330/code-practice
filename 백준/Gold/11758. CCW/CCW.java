import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] p = new int[3][2];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            p[i][0] = Integer.parseInt(st.nextToken());
            p[i][1] = Integer.parseInt(st.nextToken());
        }

        double[] d = new double[3];
        for (int i = 0; i < 3; i++) {
            if (p[(i + 1) % 3][0] - p[i % 3][0] == 0) {
                d[i] = Double.POSITIVE_INFINITY; // 수직선 처리
            } else {
                d[i] = (double) (p[(i + 1) % 3][1] - p[i % 3][1]) / 
                        (p[(i + 1) % 3][0] - p[i % 3][0]);
                d[i] = Math.round(d[i] * 1_000_000) / 1_000_000.0; // 소수점 6자리 반올림
            }
        }

        if (d[1] < d[0]) {
            if (d[1] < d[2] && d[2] < d[0]) System.out.println(-1);
            else System.out.println(1);
        } else if (d[1] > d[0]) {
            if (d[0] < d[2] && d[2] < d[1]) System.out.println(1);
            else System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
