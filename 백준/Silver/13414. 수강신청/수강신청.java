import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        String x;
        String[][] list = new String[l][2];
        for(int i=0;i<l;i++){
            x = br.readLine();
            if(map.containsKey(x)){
                list[map.get(x)][1]="";
            }
            map.put(x,i);
            list[i][0]=x;
        }
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(int i=0;i<l && cnt<k;i++){
            if(list[i][1]==null){
                sb.append(list[i][0]).append("\n");
                cnt++;
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}