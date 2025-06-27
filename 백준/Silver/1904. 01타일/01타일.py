import sys
input = sys.stdin.readline
n = int(input())
dp = [1,2]
for _ in range(n-2):
    dp[1], dp[0] = (dp[0]+dp[1])%15746, dp[1]
print(1 if n==1 else dp[1])