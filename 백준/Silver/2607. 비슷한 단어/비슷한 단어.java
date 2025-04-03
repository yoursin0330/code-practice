import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        Arrays.sort(str);
        char[] compare;
        boolean check;
        int minFlag, plusFlag;

        for(int i=0;i<n-1;i++){
            compare = br.readLine().toCharArray();
            Arrays.sort(compare);
            check = true;
            minFlag=0; plusFlag=0;
            int strIdx=0, compIdx=0;
            while(strIdx<str.length && compIdx<compare.length){
                if(str[strIdx]==compare[compIdx]){
                    strIdx++; compIdx++;
                }else if(str[strIdx]>compare[compIdx]){
                    if(minFlag>0){
                        check=false;
                        break;
                    }
                    minFlag++;
                    compIdx++;
                }else{
                    if(plusFlag>0){
                        check=false;
                        break;
                    }
                    plusFlag++;
                    strIdx++;
                }
            }
            plusFlag+=Math.max(str.length-strIdx,0);
            minFlag+=Math.max(compare.length-compIdx,0);
            if(check&&minFlag<2&&plusFlag<2) cnt++;
        }
        System.out.print(cnt);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}