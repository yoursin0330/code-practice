class Solution {
    public int[] scores= {0,0,0,0,0,0,0,0};
	public String cases= "RTCFJMAN"; 
	
	public String solution(String[] survey, int[] choices) {
        String answer = "";

		for(int i=0;i<survey.length;i++) {
			char[] temp=survey[i].toCharArray();
			int c=choices[i];
			
			if (c<=3 && c>0) scores[cases.indexOf(temp[0])]+=4-c;
			else if (c<=7 &&c>4) scores[cases.indexOf(temp[1])]+=c-4;
		}
		for(int i=0; i<8;i+=2) {
			if (scores[i]<scores[i+1]) answer+=cases.charAt(i+1);
			else answer+=cases.charAt(i);
		}
		return answer;
    }
}