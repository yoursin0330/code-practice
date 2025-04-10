import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Object> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else {
                int temp = 0;
                while (!stack.isEmpty()) {
                    Object top = stack.pop();
                    if (top instanceof Integer) {
                        temp += (int) top;
                    } else if (c == ')' && top.equals('(')) {
                        stack.push(temp == 0 ? 2 : 2 * temp);
                        break;
                    } else if (c == ']' && top.equals('[')) {
                        stack.push(temp == 0 ? 3 : 3 * temp);
                        break;
                    } else {
                        System.out.println(0);
                        return;
                    }
                }
                if (stack.isEmpty() && (c == ')' || c == ']')) {
                    // 닫는 괄호인데 짝이 없으면 잘못된 괄호열
                    System.out.println(0);
                    return;
                }
            }
        }

        int result = 0;
        for (Object obj : stack) {
            if (obj instanceof Integer) {
                result += (int) obj;
            } else {
                // 남은 괄호가 있다면 올바르지 않은 괄호열
                System.out.println(0);
                return;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
