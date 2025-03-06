import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        String str;
        char[] p;
        int n;
        boolean first=true, check = true;
        for(int i=0;i<t;i++){
            p = br.readLine().toCharArray();
            n = Integer.parseInt(br.readLine());
            str = br.readLine().replace("[","").replace("]","");
            if(!str.isEmpty())
                Arrays.stream(str.trim().split(",")).mapToInt(Integer::parseInt)
                        .boxed().forEach(deque::add);
            for(char ch:p){
                if(deque.isEmpty() && ch=='D'){
                    sb.append("error\n");
                    check=false;
                    break;
                }
                else if(ch=='R') first = !first;
                else{
                    if(first) deque.removeFirst();
                    else deque.removeLast();
                }
            }
            if(check){
                sb.append('[');
                if(!deque.isEmpty()){
                    if(first) while(!deque.isEmpty()) sb.append(deque.removeFirst()+",");
                    else while(!deque.isEmpty()) sb.append(deque.removeLast()+",");
                    sb.deleteCharAt(sb.length()-1);
                }
                sb.append("]\n");
            }
            else if(deque.isEmpty())
            deque.clear();
            first=true;
            check=true;
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}