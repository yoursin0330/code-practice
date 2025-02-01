import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int blue = 0, white = 0;
        int[][] paper = new int[n][n];
        for(int i = 0; i < n; i++){
            paper[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        Deque<int[]> queue = new ArrayDeque<>();
        queue.addFirst(new int[]{0,0,n});
        while(!queue.isEmpty()){
            int[] pt = queue.pop();
            int y = pt[0], x = pt[1];
            int l = pt[2];
            int cnt = 0;
            for(int i=0;i<l;i++){
                for(int j=0;j<l;j++){
                    cnt += paper[y+i][x+j];
                }
            }
            if(cnt == 0) white++;
            else if(cnt == l*l) blue++;
            else if(l>1){
                l/=2;
                queue.push(new int[]{y,x,l});
                queue.push(new int[]{y+l,x,l});
                queue.push(new int[]{y,l+x,l});
                queue.push(new int[]{y+l,x+l,l});
            }
        }

        System.out.print(white+"\n"+blue);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}