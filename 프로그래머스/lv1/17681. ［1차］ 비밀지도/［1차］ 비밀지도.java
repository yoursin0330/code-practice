class Solution {
    void toBinary(int n, int[] numbers, StringBuilder[] real){
        for(int i=0;i<n;i++){
            int t = numbers[i];
            int fromBackIdx=n-1;
            while(t>0){
                int temp = t%2; 
                if (temp==1) real[i].setCharAt(fromBackIdx,'#');
                t/=2;
                fromBackIdx--;
            }
        }

    }
    StringBuilder[] solution(int n, int[] arr1, int[] arr2) {
        StringBuilder[] answer = new StringBuilder[n];
        for(int k=0;k<n;k++){
            answer[k]=new StringBuilder();
            for(int l=0; l<n;l++) answer[k].append(" ");
        }
        toBinary(n,arr1,answer);
        toBinary(n,arr2,answer);

        return answer;
    }
}