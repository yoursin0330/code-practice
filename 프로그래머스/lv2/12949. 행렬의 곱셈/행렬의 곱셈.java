class Solution {
       public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int k=0;k<arr2[0].length;k++){
                int temp=0;
                for(int j=0;j<arr2.length;j++){
                    temp+=arr1[i][j]*arr2[j][k];
                }
                answer[i][k]=temp;
            }
        }
        return answer;
    }
}