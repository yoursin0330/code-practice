import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        for(int i=0;i<26;i++) alphabet[i] = -1;
        char[] str = br.readLine().toCharArray();
        for(int i=0;i<str.length;i++){
            int x = str[i]-'a';
            if(alphabet[x]==-1) alphabet[x]=i;
        }
        for(int i=0;i<26;i++) System.out.print(alphabet[i]+" ");
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}