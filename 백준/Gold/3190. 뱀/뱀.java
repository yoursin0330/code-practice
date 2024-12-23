import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 보드의 크기
        int k = Integer.parseInt(br.readLine()); // 사과의 개수
        int[][] arr = new int[n][n];

        //사과 1, 빈곳 0, 뱀 -1
        for(int i=0;i<k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
            arr[y-1][x-1] = 1;
        }
        int l = Integer.parseInt(br.readLine()); //뱀의 방향 전환 횟수

        int[][] dirChange = new int[l][n];
        for(int i=0;i<l;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int c = (st.nextToken().charAt(0)=='L'? 5 : 3);
            dirChange[i] = new int[]{x,c};
        }

        int[] dy = {0, -1, 0, 1};
        int[] dx = {1, 0, -1, 0};
        int dir=0; //방향 인덱스
        int ny, nx;
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{0,0});
        arr[0][0] = -1;
        long t=1;

        int dirPtr=0;
        int x=0;
        while(dirPtr<=l){
            if(dirPtr==l)
                x+=n;
            else x = dirChange[dirPtr][0];
            for(;t<=x;t++){
                int [] head = stack.getLast();
                ny = head[0]+dy[dir]; nx=head[1]+dx[dir];
                if(ny<0 || nx<0 || ny==n || nx==n || arr[ny][nx]==-1){
                    System.out.println(t);
                    return;
                }
                stack.addLast(new int[]{ny,nx});
                if (arr[ny][nx]==1){ // 사과
                    arr[ny][nx]=-1;
                }
                else{
                    arr[ny][nx]=-1;
                    int[] tail = stack.removeFirst();
                    arr[tail[0]][tail[1]]=0;
                }
            }
            if(dirPtr<l)
                dir=(dir+dirChange[dirPtr][1])%4;
            dirPtr++;
        }
        System.out.println(t);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}