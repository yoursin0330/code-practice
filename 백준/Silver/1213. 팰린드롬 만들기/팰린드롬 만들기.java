import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder front = new StringBuilder();
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = br.readLine().toCharArray();
        for(char ch:chars){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        char odd=' ';
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char ch = entry.getKey();
            int cnt = entry.getValue();
            if(cnt%2==1) {
                if (odd != ' ') {
                    System.out.print("I'm Sorry Hansoo");
                    odd='0';
                    break;
                }
                odd = ch;
            }
            front.append(String.valueOf(ch).repeat(Math.max(0, cnt / 2)));
        }
        if(odd!='0') {
            System.out.print(front);
            if (odd != ' ') System.out.print(odd);
            System.out.print(front.reverse());
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}