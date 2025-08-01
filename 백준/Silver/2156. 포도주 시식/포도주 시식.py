import sys
input = sys.stdin.readline
n = int(input())
dp = [[0,0,0] for _ in range(n)]
dp[0][2] = dp[0][1] = int(input())
for i in range(1,n):
    x = int(input())
    dp[i][0] = max(dp[i-1])
    dp[i][1] = dp[i-1][0]+x
    dp[i][2] = dp[i-1][1]+x
print(max(dp[n-1]))