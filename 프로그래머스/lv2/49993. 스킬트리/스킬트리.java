import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        //Hashmap을 사용하여 해당 값의 인덱스 순서를 찾기 쉽게 함
        int answer = skill_trees.length;
        HashMap<Character,Integer> skillMap = new HashMap<>();
        char[] skillChar = skill.toCharArray();
        for(int i=0;i<skillChar.length;i++){
            skillMap.put(skillChar[i],i);
        }
        for(String skills:skill_trees){
            int before =-1;
            for(char ch:skills.toCharArray()){
                if(skillMap.containsKey(ch)){
                    int skillIdx=skillMap.get(ch);
                    if(before+1==skillIdx) before=skillIdx;
                    else {
                        answer--;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}