import sys
input=sys.stdin.readline
t = int(input())

dp = [0 for _ in range(1000000)]
dp[0],dp[1],dp[2] = 1,2,4

for x in range(3,1000000):
    dp[x] = (dp[x-3]+dp[x-2]+dp[x-1])%1000000009
for _ in range(t):
    print(dp[int(input())-1])