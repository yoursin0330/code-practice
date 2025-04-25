import sys
import math
input = sys.stdin.readline

n = int(input())
dp = [0] * (n + 1)
for i in range(1, n + 1):
    min_val = i  # 최악은 1^2을 i번 더하는 경우
    for j in range(1, int(math.sqrt(i)) + 1):
        min_val = min(min_val, dp[i - j * j] + 1)
    dp[i] = min_val

print(dp[n])
