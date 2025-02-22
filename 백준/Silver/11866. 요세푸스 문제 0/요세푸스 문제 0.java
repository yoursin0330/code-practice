import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int idx=0;
        StringBuilder sb = new StringBuilder("<");
        while(k>0 && !list.isEmpty()){
            idx=(idx+k-1)%list.size();
            sb.append(list.remove(idx)+", ");
        }
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb+">");
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}