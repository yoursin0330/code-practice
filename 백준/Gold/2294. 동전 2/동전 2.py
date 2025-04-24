import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coins = [0 for _ in range(n)]
for i in range(len(coins)):
    coins[i] = int(input())
coins.sort()

dp = [0 for _ in range(k+1)]
for i in range(1, k+1):
    for coin in coins:
        if coin>i: break
        if i-coin!=0 and dp[i-coin]==0: continue
        dp[i] = dp[i-coin]+1 if dp[i]==0 else min(dp[i], dp[i-coin]+1)
        
if dp[k]==0: print(-1)
else: print(dp[k])