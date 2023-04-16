class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] numbers = new int[3];
        int idx=0;
        for (char ch : dartResult.toCharArray()) {
            if(ch<='9' && ch>='0'){
                if(ch=='0') numbers[idx]*=10;
                else numbers[idx]+=(int)(ch-'0');
            }
            else {
                switch (ch) {
                    case 'S':
                        idx++;
                        break;
                    case 'D':
                      numbers[idx]*=numbers[idx];
                      idx++;
                      break;
                    case 'T':
                        numbers[idx]*=numbers[idx]*numbers[idx];
                        idx++;
                        break;
                    case '*':
                        numbers[idx-1]*=2;
                        if(idx-2>=0) numbers[idx-2]*=2;
                        break;
                    case '#':
                        numbers[idx-1]*=-1;
                }
            }

        }
        answer += numbers[0] + numbers[1] + numbers[2];
        return answer;
    }
}