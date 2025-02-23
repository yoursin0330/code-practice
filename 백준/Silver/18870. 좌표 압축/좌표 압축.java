import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            Integer x = Integer.parseInt(st.nextToken());
            ArrayList<Integer> list = map.getOrDefault(x, new ArrayList<>());
            list.add(i);
            map.put(x, list);
        }
        int[] ans = new int[n];
        int cnt=0;
        for(ArrayList<Integer> val : map.values()){
            for(int idx: val){
                ans[idx] = cnt;
            }
            cnt++;
        }
        for(int x:ans) sb.append(x+" ");
        System.out.print(sb.delete(sb.length()-1,sb.length()));
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}