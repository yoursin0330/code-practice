import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int tmpr, tmpc;
        int set = (int)Math.pow(2,n-1);
        while(set>=1){
            tmpr = r/set; tmpc = c/set;
            if(tmpr==1){
                if(tmpc==1) cnt+=set*set*3;
                else cnt+=set*set*2;
            }
            else if(tmpc==1) cnt+=set*set;
            r%=set;
            c%=set;
            set/=2;
        }

        if(r==1) cnt+=2;
        if(c==1) cnt+=2;
        else cnt+=1;
        System.out.println(cnt-1);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}