import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer;

        List<String[]> inout = new ArrayList<>();
        Map<String, String> nickname= new HashMap<>(); //id , nickname 형태

        for(int i=0;i<record.length;i++) {
            String[] temp=record[i].split(" ");
            if(temp[0].equals("Enter")) {
                if (nickname.containsKey(temp[1])){ //id를 가지고있을때
                    nickname.replace(temp[1],temp[2]);
                }
                else nickname.put(temp[1],temp[2]);
                String[] str= new String[2];
                str[0]=temp[0];
                str[1]=temp[1];
                inout.add(str);
            }
            else if(temp[0].equals("Change")) nickname.replace(temp[1],temp[2]);

            else { //Leave일 때
                String[] str= new String[2];
                str[0]=temp[0];str[1]=temp[1];
                inout.add(str);
            }
        }
        answer=new String[inout.size()];
        for (int i=0;i<inout.size();i++){
            String[] temp=inout.get(i);
            String name=nickname.get(temp[1]);
            if (temp[0].equals("Enter")){
                answer[i]=(name+"님이 들어왔습니다.");
            }
            else{
                answer[i]=(name+"님이 나갔습니다.");
            }
        }
        return answer;
    }
}