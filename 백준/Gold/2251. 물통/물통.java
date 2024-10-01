import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[][][] visited;
    static List<Integer> answer = new ArrayList<>();
    int[] container = new int[3];

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 3; i++){
            container[i] = Integer.parseInt(st.nextToken());
        }

        //물통에 0부터 최대 용량까지 저장 가능
        visited = new boolean[container[0]+1][container[1]+1][container[2]+1];
        bfs();

        Collections.sort(answer);
        for(int ans :answer) System.out.print(ans + " "); // 띄어쓰기 구분자로 출력
    }

    public void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,container[2]});
        visited[0][0][container[2]] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            // 현재 물통에 담겨있는 물
            int A = cur[0];
            int B = cur[1];
            int C = cur[2];
            
            if(A == 0 && !answer.contains(C)){
                answer.add(C);
            }
            
            pour(A,B,C,0,1,q);
            pour(A,B,C,1,0,q);
            pour(A,B,C,2,0,q);
            pour(A,B,C,0,2,q);
            pour(A,B,C,1,2,q);
            pour(A,B,C,2,1,q);
        }
    }

    public void pour(int A, int B, int C, int from, int to, Queue<int[]> q){
        int[] water = {A, B, C};
        // 물통의 크기 - 현재 물통에 담겨있는 양
        int spaceLeft = container[to] - water[to];
        // 물통의 빈 크기나 옮길 물 중 작은 값이 옮겨짐
        int waterMoving = Math.min(water[from], spaceLeft);
        
        //물을 from에서 to로 옮김
        water[from] -= waterMoving;
        water[to] += waterMoving;
        
        if(!visited[water[0]][water[1]][water[2]]){
            visited[water[0]][water[1]][water[2]]=true;
            q.add(new int[]{water[0],water[1],water[2]});            
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}