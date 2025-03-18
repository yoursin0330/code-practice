import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    int ans=0;
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        dfs(n, 0, list);
        System.out.print(ans);
    }
    public void dfs(int n, int row, List<Integer> list){
        if(row==n){
            ans++;
            return;
        }
        for(int col=0;col<n; col++){
            boolean check=true;
            for(int i=0;i<row;i++) { // promising
                if (list.get(i) == col || Math.abs(list.get(i) - col) == row - i) {
                    check = false;
                    break;
                }
            }
            if(check){
                list.add(col);
                dfs(n, row+1, list);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}