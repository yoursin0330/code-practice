import sys
input = sys.stdin.readline
t = int(input())
for _ in range(t):
    n = int(input())
    value = [[0]*(n+1) for _ in range(2)]
    value[0][1:] = list(map(int, input().split()))
    value[1][1:] = list(map(int, input().split()))
    dp = [[0]*(n+1) for _ in range(2)]
    dp[0][1] = value[0][1]
    dp[1][1] = value[1][1]
    for i in range(2, n+1):
        dp[0][i] = max(dp[1][i-1], dp[1][i-2]) + value[0][i] ## upper sticker
        dp[1][i] = max(dp[0][i-1], dp[0][i-2]) + value[1][i] ## lower sticker
    print(max(dp[0][n], dp[1][n]))