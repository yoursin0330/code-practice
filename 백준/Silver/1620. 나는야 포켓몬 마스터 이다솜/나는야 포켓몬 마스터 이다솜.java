import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer,String> idxToName = new HashMap<>();
        HashMap<String,Integer> nameToIdx = new HashMap<>();

        for(int i=0;i<n;i++){
            String str = br.readLine();
            idxToName.put(i+1,str);
            nameToIdx.put(str,i+1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(str.matches("\\d*")) sb.append(idxToName.get(Integer.parseInt(str))).append("\n");
            else sb.append(nameToIdx.get(str)).append("\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}