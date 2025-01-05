import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Boolean> names = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++) names.put(br.readLine(),true);
        for(int i=0;i<m;i++){
            String name = br.readLine();
            if(names.containsKey(name)) ans.add(name);
        }
        Collections.sort(ans);
        sb.append(ans.size()).append("\n");
        for(String str : ans){
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}