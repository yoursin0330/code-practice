import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().split())
p = [-1 for _ in range(100001)]

dq = deque([n])
p[n]= 0

while dq:
    x= dq.popleft()
    if x==k :
        print(p[k])
        break
    
    if 0<2*x<100001 and (p[2*x]==-1 or p[2*x]>p[x]):
        p[2*x]=p[x]
        dq.appendleft(2*x) # 우선 처리
        
    if 0<=x-1<100001 and (p[x-1]==-1 or p[x-1]>p[x]):
        p[x-1] = p[x]+1
        dq.append(x-1)
    if 0<=x+1<100001 and (p[x+1]==-1 or p[x+1]>p[x]):
        p[x+1] = p[x]+1
        dq.append(x+1)