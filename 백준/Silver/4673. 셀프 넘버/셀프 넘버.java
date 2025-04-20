import java.util.*;

public class Main {
    public int selfNum(int num){
        int ans=num;
        for(char c : String.valueOf(num).toCharArray())
            ans+=c-'0';
        return ans;
    }
    public void solution() throws Exception{
        StringBuilder sb = new StringBuilder();
        boolean [] check = new boolean[10001];
        int x;
        for(int i=1;i<=10000;i++){
            x = selfNum(i);
            if(x<=10000)
                check[x]=true;
        }
        for(int i=1;i<=10000;i++)
            if(!check[i]) sb.append(i).append("\n");
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}