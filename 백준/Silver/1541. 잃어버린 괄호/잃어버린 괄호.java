import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
//        Stack<String> list = new Stack<>();
        List<String> list = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch<'0'){
                list.add(new String(tmp));
                tmp = new StringBuilder();
                list.add(String.valueOf(ch));
            }
            else{
                tmp.append(ch);
            }
        }
        list.add(new String(tmp));
        int idx= list.size()-2; //부호부터
        while(idx>=0){
            String st = list.get(idx);
            if(st.contentEquals("-")){
                int sum=0;
                int curIdx = idx+1;
                int maxIdx = 0;
                int maxSum = 0;
                while(curIdx<list.size()){
                    sum+=Integer.parseInt(list.get(curIdx));
                    if(maxSum<sum){
                        maxIdx=curIdx;
                        maxSum=sum;
                    }
                    curIdx++;
                }
                list.set(idx, String.valueOf(-1*maxSum));
                curIdx=maxIdx;
                while(curIdx>idx){
                    list.remove(curIdx--);
                }
                idx-=2;
            }else{
                list.remove(idx);
                idx-=2;
            }
        }
        int ans=0;
        for(String st: list){
            ans+=Integer.parseInt(st);
        }
        System.out.print(ans);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}