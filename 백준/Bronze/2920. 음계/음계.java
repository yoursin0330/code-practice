import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int now;
        boolean asc=true;
        boolean desc=true;
        StringTokenizer st=new StringTokenizer(br.readLine());
        int bf = Integer.parseInt(st.nextToken());
        for(int i=0;i<7;i++){
            now = Integer.parseInt(st.nextToken());
            if(now!=bf+1) asc=false;
            if(now!=bf-1) desc=false;
            bf=now;
        }
        if(asc) System.out.println("ascending");
        else if(desc) System.out.println("descending");
        else System.out.println("mixed");
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
