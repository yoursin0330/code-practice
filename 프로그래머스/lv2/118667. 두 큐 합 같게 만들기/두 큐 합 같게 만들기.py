from collections import deque
def solution(queue1, queue2):
    sum1=sum2=0
    q1=deque(); q2=deque(); 
    for x in queue1:
        sum1+=x
        q1.append(x)
    for x in queue2:
        sum2+=x
        q2.append(x)
    count=0
    q1.append(0); q2.append(0); 
    flag1=flag2=True
    while sum1!=sum2:
        if sum1>sum2:
            tmp=q1.popleft()
            sum1-=tmp
            sum2+=tmp
            if tmp==0 or sum1==0:
                flag1=False
            else:
                q2.append(tmp)
                count+=1
        elif sum1<sum2:
            tmp=q2.popleft()
            sum2-=tmp
            sum1+=tmp
            if tmp==0 or sum2==0 : 
                flag2=False
            else:
                q1.append(tmp)
                count+=1
        if not flag1 and not flag2:
            return -1
    return count
