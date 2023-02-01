class Solution {
	public int nameToIdx(String[] id_list, String name){
		for(int i=0;i<id_list.length;i++) {
			if (id_list[i].compareTo(name)==0) return i;
		}
		return -1;  
	}
    public int[] solution(String[] id_list, String[] report, int k) {
    	int l=id_list.length;
        int[] answer = new int[l];//각 유저별로 처리 결과 메일을 받은 횟수
        int[][] reportCheck=new int[l+1][l];
        for(String rp:report) {
        	String[] reports=rp.split(" ");
        	int oneIdx=nameToIdx(id_list,reports[0]);
        	int twoIdx=nameToIdx(id_list,reports[1]);
        	if (reportCheck[oneIdx][twoIdx]==0){
        		reportCheck[oneIdx][twoIdx]++;	
                reportCheck[l][twoIdx]++;
            }
        }
        for(int i=0;i<l;i++) 
        	if(reportCheck[l][i]>=k)
                for(int j=0;j<l;j++) if (reportCheck[j][i]==1) answer[j]++;
        
        return answer;
    }
}