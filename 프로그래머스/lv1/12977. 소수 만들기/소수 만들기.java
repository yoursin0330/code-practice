class Solution {
    public boolean sosu(int x){//소수면 true, 소수가 아니면 false
        //x는 세 수를 다 더한 값
        for(int i=2;i<x/2;i++){
            if (x%i==0) return false;
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        int len= nums.length;
        for(int i=0;i<len;i++)
            for (int j=i+1;j<len;j++)
                for (int k=j+1;k<len;k++)
                    if(sosu(nums[i]+nums[j]+nums[k]))   answer++; 
        return answer;
    }
}