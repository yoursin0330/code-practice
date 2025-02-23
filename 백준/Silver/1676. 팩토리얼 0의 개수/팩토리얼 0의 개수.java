import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger ans = BigInteger.ONE;
        for(int i=2;i<=n;i++) ans = ans.multiply(BigInteger.valueOf(i));
        String str = String.valueOf(ans);
        int cnt = str.length();
        str = str.replaceAll("0"," ");
        str = str.trim();
        System.out.println(cnt - str.length());
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}