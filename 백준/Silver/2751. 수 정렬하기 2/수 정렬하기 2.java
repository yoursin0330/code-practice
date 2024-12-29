import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int t = Integer.parseInt(br.readLine());
            arr.add(t);
        }
        Collections.sort(arr);
        StringBuilder st = new StringBuilder();
        for(int l :arr) st.append(l).append("\n");
        System.out.println(st);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}