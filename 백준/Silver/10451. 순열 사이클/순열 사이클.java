import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int n;
        int[] arr;
        boolean[] visited;
        int cnt;
        for(int i=0;i<t;i++){
            n = Integer.parseInt(br.readLine());
            arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            visited = new boolean[n];
            cnt=0;
            for(int j=0;j<n;j++){
                if(!visited[j]){
                    cnt++;
                    int tmp=j; // 다음
                    while(!visited[tmp]){
                        visited[tmp]=true;
                        tmp=arr[tmp]-1;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);

    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}