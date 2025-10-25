import sys
input=sys.stdin.readline
n = int(input())
dp = [0 for _ in range(n+1)]
val = [0]+list(map(int, input().split()))
dp[1] = 1
maxval=0
for i in range(2,n+1):
    for before in range(i,-1,-1):
        if val[before]>=val[i] and dp[i]<dp[before]+1:
            dp[i] = dp[before]+1
    maxval=max(maxval, dp[i])
if val[1]==val[-1] and max(val)==val[-1]:
    maxval=1
print(n-maxval)