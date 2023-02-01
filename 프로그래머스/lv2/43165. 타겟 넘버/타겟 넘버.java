class Solution {
	int answer = 0;
	public void dfsSol(int[] numbers, int index, int target, int now){
		if (index>=numbers.length) {
			if (target==now) answer++;
			return; //문장의 끝이라면
		}
		dfsSol(numbers, index+1, target, now+numbers[index]);
		dfsSol(numbers, index+1, target, now-numbers[index]);
		
	}
    public int solution(int[] numbers, int target) {
        dfsSol(numbers,0,target,0);
        return answer;
    }
}