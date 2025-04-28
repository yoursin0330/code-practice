import sys
input = sys.stdin.readline

n, s = map(int, input().split())
arr = [0]+list(map(int, input().split()))
idxstart=-1
ans=n+1
for i in range(1,n+1):
    arr[i] += arr[i-1]
    if arr[i]>=s and idxstart<0:
        idxstart=0
    if idxstart>-1:
        for x in range(idxstart,i+1):
            if arr[i]-arr[x]<s:
                idxstart=x-1
                ans = min(ans, i-x+1)
                break
print(ans if ans<=n else 0)