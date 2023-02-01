import math
def solution(number, limit, power):
    answer = 1;#1 카운트 
    #약수개수구하기
    for x in range(2,number+1):
        num=0
        i=1
        while(i<(math.sqrt(x))):
            if x%i==0:
                num+=2;
            i+=1;
        if x%(math.sqrt(x))==0: num+=1;
        if num>limit: answer+=power;
        else :answer+=num;
    return answer