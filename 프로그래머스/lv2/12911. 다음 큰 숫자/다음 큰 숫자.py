def oneCount(num)->int:
    count=0
    while(num>0):
        if num%2==1: count+=1
        num//=2
    return count
def solution(n):
    a=oneCount(n);
    answer=n+1 
    while(a != oneCount(answer)): answer+=1
    return answer