import java.io.*;
import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static int[] fruits;
    static int maxFruits = 0;
    static int startNode = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fruits = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) fruits[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.computeIfAbsent(a, x -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, x -> new ArrayList<>()).add(a);
        }

        // Step 1: 아무 노드에서 가장 먼 노드 찾기
        Result r1 = dfsToFindFarthest(1, -1, 0, 0);
        // Step 2: 그 노드에서 다시 DFS
        Result r2 = dfsToFindFarthest(r1.node, -1, 0, 0);

        // Step 3: 정답 출력
        System.out.println(r2.totalFruits + " " + Math.min(r2.node, r1.node));
    }

    static class Result {
        int node;
        int totalFruits;
        Result(int node, int totalFruits) {
            this.node = node;
            this.totalFruits = totalFruits;
        }
    }

    public Result dfsToFindFarthest(int current, int parent, int totalFruits, int depth) {
        totalFruits += fruits[current];
        Result best = new Result(current, totalFruits);

        for (int next : graph.getOrDefault(current, Collections.emptyList())) {
            if (next == parent) continue;
            Result r = dfsToFindFarthest(next, current, totalFruits, depth + 1);
            if (r.totalFruits > best.totalFruits || 
                (r.totalFruits == best.totalFruits && r.node < best.node)) {
                best = r;
            }
        }

        return best;
    }
}
