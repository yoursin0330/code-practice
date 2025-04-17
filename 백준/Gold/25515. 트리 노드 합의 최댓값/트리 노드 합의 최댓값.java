import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static int[] val;
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int k,v;
        for(int i=0;i<n-1;i++){
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph.computeIfAbsent(k,x->new ArrayList<>()).add(v);
        }
        st = new StringTokenizer(br.readLine());
        val = new int[n];
        for(int i=0;i<n;i++){
            val[i]= Integer.parseInt(st.nextToken());
        }
        long ans = recur(0);
        System.out.print(ans);
    }
    long recur(int node){
        if(!graph.containsKey(node)) return val[node];
        long sum=0;
        for(int next:graph.get(node)){
            long child = recur(next);
            if(child+val[node]>val[node])
                sum +=child;
        }
        return sum+val[node];
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
