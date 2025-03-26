import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public void solution() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max=0;
        int asc=0;
        int desc=-1;
        int bf=10;
        boolean isAsc=false;
        boolean isDesc=false;
        for(int x: Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()){
            if(bf==x){
                asc++;
                desc++;
                isAsc=true;
                isDesc=true;
            }
            else if(bf<x){ // 증가
                asc++;
                isAsc=true;
                if(isDesc){
                    max=Math.max(desc+1, max);
                    desc=0;
                    isDesc=false;
                }
            }
            else{
                desc++;
                isDesc=true;
                if(isAsc){
                    max=Math.max(asc+1, max);
                    asc=0;
                    isAsc=false;
                }
            }
            bf=x;
        }
        System.out.println(Math.max(max,Math.max(asc+1,desc+1)));

    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}