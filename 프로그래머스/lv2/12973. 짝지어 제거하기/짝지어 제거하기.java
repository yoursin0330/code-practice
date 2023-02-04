import java.util.Stack;
class Solution{
public int solution(String s){
        Stack stack = new Stack();
        int idx = 0;
        char[] chars = s.toCharArray();
        while(idx<chars.length){
            if (stack.isEmpty()) stack.push(chars[idx]);
            else if(stack.peek().equals(chars[idx]))   stack.pop();
            else stack.push(chars[idx]);
            idx++;
        }
        if (stack.isEmpty()) return 1;
        else return 0;
    }
}