class Solution {
    public long solution(long r1, long r2) {

        long answer = 0;
        //한 사분면 위의 값을 다 세고, 양의 x축 위의 좌표들 합한 값의 네배
        answer+=r2-r1+1; //양의 x축 위 좌표 수
        long i=1;
        for(;i<r1;i++){
            long l2 = (long) Math.floor(Math.sqrt(r2 * r2 - i * i));
            long l1 = (long) Math.floor(Math.sqrt(r1 * r1 - i * i));
            if(l1*l1 ==(r1*r1-i*i)) answer++;
            answer+=l2-l1;
        }
        for(;i<r2;i++){
            answer+=(long)(Math.sqrt(r2*r2-i*i));
        }
        return answer*4;
    }
}