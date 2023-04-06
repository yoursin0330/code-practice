import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length<2) return new int[]{-1};
        int[] answer = new int[arr.length-1];
        int[] sortArr=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortArr);
        int idx=0;
        for(int x:arr){
            if(sortArr[0]!=x)  answer[idx++]=x;
        }
        return answer;
    }
}