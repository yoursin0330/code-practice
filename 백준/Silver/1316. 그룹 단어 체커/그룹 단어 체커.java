import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr;
        char now;
        boolean[] al;
        int ans=0;
        for(int i=0;i<n;i++){
            arr = br.readLine().toCharArray();
            al = new boolean[26];
            now = arr[0];
            al[arr[0]-'a']=true;
            boolean check = true;
            for(int j=1;j<arr.length;j++){
                if(arr[j]!=now){
                    if(al[arr[j]-'a']){
                        check=false;
                        break;
                    }else{
                        al[arr[j]-'a']=true;
                        now=arr[j];
                    }
                }
            }
            if(check) ans++;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}