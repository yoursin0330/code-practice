class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean bfBlank=true;
        for(char ch:s.toLowerCase().toCharArray()){
            char temp=ch;
            if(ch==' ') {
                bfBlank=true;
            }
            else if(ch<='9'&& ch>='0'){
                bfBlank=false;
            }else if(bfBlank){
                //문자고, 이전에 공백이 있었으니 대문자로 바꿔주기
                ch=(char)(ch-'a'+'A');
                bfBlank=false;
            }
            answer.append(ch);
        }
        return new String(answer);
    }
}