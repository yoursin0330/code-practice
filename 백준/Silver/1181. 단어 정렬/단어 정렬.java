import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        // TreeSet을 사용하여 중복 제거 + 정렬
        Set<String> set = new TreeSet<>((a, b) -> {
            if (a.length() == b.length()) return a.compareTo(b); // 길이가 같으면 사전순
            return Integer.compare(a.length(), b.length()); // 길이순 정렬
        });

        for (int i = 0; i < n; i++) {
            set.add(br.readLine()); // 중복 자동 제거
        }

        for (String s : set) sb.append(s).append("\n");
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}