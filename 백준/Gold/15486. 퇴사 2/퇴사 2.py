import sys
input = sys.stdin.readline
n = int(input())
end=0
dp = [0 for _ in range(50)]

for _ in range(n):
    t,p = map(int, input().split())
    dp[t-1] = max(dp[t-1],end+p)
    end = max(dp[0], end)
    dp = dp[1:]+[0]
print(end)