import sys, heapq,math
input=sys.stdin.readline

n = int(input())
heap = []
ans=""
for _ in range(n):
    x= int(input())
    if x==0 : 
        if heap: ans+=str(heapq.heappop(heap)[1])+"\n"
        else : ans+="0\n"
    else :  heapq.heappush(heap,[int(math.fabs(x)), x])
print(ans)