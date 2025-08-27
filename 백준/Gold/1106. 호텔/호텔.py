import sys
input = sys.stdin.readline
c,n = map(int, input().split())
dp = [0 for _ in range(1101)]
for _ in range(n):
    cost, ppl = map(int, input().split())
    dp[ppl]= cost if dp[ppl]==0 else min(dp[ppl],cost)
    for i in range(ppl+1, c+ppl):
        if dp[i-ppl]>0 and (dp[i]==0 or dp[i]>dp[i-ppl]+cost):
            dp[i] = dp[i-ppl]+cost
min_cost=1000*100
for idx in range(c, c+101):
    if min_cost>dp[idx]>0: min_cost = dp[idx]
print(min_cost)