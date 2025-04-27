import sys
input = sys.stdin.readline

n,x = map(int, input().split())
visitcnt = [0]+list(map(int, input().split()))

if max(visitcnt)==0 : print("SAD")
else:
    for k in range(2,n+1):
        visitcnt[k]+=visitcnt[k-1]
    maxvisit=0
    days=0
    for d in range(x, n+1):
        visitsum = visitcnt[d]-visitcnt[d-x]
        if maxvisit<visitsum:
            days=1
            maxvisit=visitsum
        elif maxvisit==visitsum: days+=1
    print(f'{maxvisit}\n{days}')