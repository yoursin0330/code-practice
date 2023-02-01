class Solution {
    public boolean sosu(long x) {
		if (x<2) return false;
		int z=2;
		while(z<=Math.sqrt(x)) {
			if(x%z==0) return false;
			z++;
		}
		return true;
	}
    public int solution(int n, int k) {
    	String k_changed="";
        int answer = 0;
        while(n>0){
            k_changed+=n%k;
            n/=k;
        }
        String[] num = new StringBuffer(k_changed).reverse().toString().split("0");
        for(int l=0;l<num.length;l++) {
            if (num[l].equals("")) continue;
            else if(sosu(Long.parseLong(num[l]))) answer++;
        }
        return answer;
    }
}