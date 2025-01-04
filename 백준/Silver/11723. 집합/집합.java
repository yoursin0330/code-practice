import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String calc;
        int num=0;
        boolean[] s = new boolean[20];

        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            calc = st.nextToken();
            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken())-1;
            if(calc.equals("add"))
                s[num]=true;
            else if(calc.equals("remove"))
                s[num]=false;
            else if(calc.equals("check"))
                sb.append(s[num]?"1":"0").append("\n");
            else if(calc.equals("toggle"))
                s[num]=!s[num];
            else if(calc.equals("all"))
                for(int j=0;j<20;j++) s[j]=true;
            else
                for(int j=0;j<20;j++) s[j]=false;
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}