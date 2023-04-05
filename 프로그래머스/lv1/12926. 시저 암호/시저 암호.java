class Solution {
        public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x==' ') answer+=" ";
            else if(x<='Z') answer+=(char)((x+n>'Z')? x+n-'Z'+'A'-1: x+n);
            else answer+=(char)((x+n>'z')? x+n-'z'+'a'-1: x+n);
        }
        return answer;
    }
}