import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int l; // 알파벳 개수
    static int c; // 암호 길이
    StringBuilder sb;
    char[] code;
    char[] chars;

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        code = new char[l];
        sb = new StringBuilder();

        chars = br.readLine().replaceAll(" ", "").toCharArray();
        Arrays.sort(chars);

        makecode(0,0);

        System.out.print(sb);
    }
    public void makecode(int x, int idx){
        if(idx == l){
            if(checkCode()){
                sb.append(code).append("\n");
            }
            return;
        }
        for(int i=x;i<c;i++){
            code[idx] = chars[i];
            makecode(i+1,idx+1);
        }

    }
    boolean checkCode(){
        int vlen = 0, clen=0;
        for(char x:code){
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') vlen++;
            else clen++;
        }
        if(vlen<1||clen<2) return false;
        return true;
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}