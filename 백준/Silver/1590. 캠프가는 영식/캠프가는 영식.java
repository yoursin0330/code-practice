import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n =Long.parseLong(st.nextToken()); // 버스 개수
        long t =Long.parseLong(st.nextToken()); // 도착 시간
        long s,i,c,tmp;
        long ans=(long)Math.pow(2,31);
        for(int k=0;k<n;k++){
            st = new StringTokenizer(br.readLine());
            s = Long.parseLong(st.nextToken()); //시작시간
            i= Long.parseLong(st.nextToken()); //간격
            c= Long.parseLong(st.nextToken()); // 대수
            if(t<= s){
                ans = Math.min(ans,s-t);
                continue;
            }
            tmp = (long)Math.ceil((t-s)/(float)i);
            if(tmp<c){
               ans=Math.min(ans,tmp*i+s-t);
            }
        }
        if(ans==(long)Math.pow(2,31)) ans=-1;
        System.out.print(ans);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
