class Solution {
    int gcd(int a, int b){
        if (a%b==0) return b;
        return gcd(b,a%b);
    }
    public int solution(int[] arr) {
        if(arr.length<2) return arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]=(arr[i]*arr[i+1])/gcd(arr[i],arr[i+1]);
        }
        return arr[arr.length-1];
    }
}