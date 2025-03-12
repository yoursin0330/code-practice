import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        boolean check;
        Stack<Integer> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('[',1);
        map.put(']',-1);
        map.put('(',2);
        map.put(')',-2);
        while(true){
            str = br.readLine();
            if(str.matches(".")) break;

            check=true;

            for(char ch: str.toCharArray()){
                if(map.containsKey(ch)){
                    int val = map.get(ch);
                    if(val>0) stack.push(val);
                    else{
                        if(stack.isEmpty()||stack.peek()+val!=0){
                            check=false;
                            break;
                        }
                        else stack.pop();
                    }
                }
            }
            if(check && stack.isEmpty()) sb.append("yes\n");
            else{
                sb.append("no\n");
                stack.clear();
            }
        }
        System.out.print(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}