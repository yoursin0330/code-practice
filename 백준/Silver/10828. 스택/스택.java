import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String keyword;
        int idx=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            st= new StringTokenizer(br.readLine());
            keyword = st.nextToken();
            if(keyword.equals("empty")){
                sb.append(idx==0?1:0).append("\n");
            }
            else if(keyword.equals("size")){
                sb.append(idx).append("\n");
            }
            else if(keyword.equals("top")){
                sb.append(idx==0?-1:list.get(idx-1)).append("\n");
            }
            else if(keyword.equals("pop")){
                sb.append(idx==0?-1:list.remove(--idx)).append("\n");
            }
            else{ //push
                list.add(Integer.parseInt(st.nextToken()));
                idx++;
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}