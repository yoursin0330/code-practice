import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            List<Integer> arr = new ArrayList();
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);
            if(arr.get(0) == 0 && arr.get(1) == 0 && arr.get(2) == 0) break;
            else if(arr.get(0)*arr.get(0)+arr.get(1)*arr.get(1) == arr.get(2)*arr.get(2)) sb.append("right\n");
            else sb.append("wrong\n");
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}