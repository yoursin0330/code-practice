import sys
input=sys.stdin.readline

n,k = map(int, input().split())

# w, v
## knapsack
dp = [0 for _ in range(k+1)]

for _ in range(n):
    w,v = map(int, input().split())
    for weight in range(k, w,-1):
        if dp[weight-w]!=0 : dp[weight] = max(dp[weight-w]+v, dp[weight])
    if w<=k : dp[w] = max(dp[w],v)
print(max(dp))