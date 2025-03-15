import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = String.valueOf(n).length();
        if(len==1){
            if(n%2==0) System.out.println(n/2);
            else System.out.println(0);
            return;
        }
        int[] arr = new int[len];
        boolean check = false;
        int maxDigit = (int)Math.pow(10,len-1);
        int m = (n/maxDigit-1)*maxDigit;
        for(;m<n;m++){
            int sum=0;
            for(int i=0;i<len;i++){
                arr[i] = (m/((int)Math.pow(10,i+1)/10))%10;
                sum+=arr[i];
            }
            if(sum+m==n){
                check=true;
                break;
            }
        }
        if(check) System.out.println(m);
        else System.out.println(0);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}