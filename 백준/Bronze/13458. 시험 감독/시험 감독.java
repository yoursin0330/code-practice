import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st2.nextToken()), c= Integer.parseInt(st2.nextToken());
        int part;
        for (int i=0;i<n;i++){
            part= Integer.parseInt(st.nextToken());
            part-=b;
            answer++;
            if(part>0){
                answer+=part/c;
                if(part%c!=0) answer++;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}