import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

# dp[i][j]는 i부터 j까지의 부분 수열이 팰린드롬인지 여부를 저장 (1이면 팰린드롬)
dp = [[0 for _ in range(n)] for _ in range(n)]

# 길이가 1인 경우 (항상 팰린드롬)
for i in range(n):
    dp[i][i] = 1

# 길이가 2인 경우
for i in range(n - 1):
    if arr[i] == arr[i + 1]:
        dp[i][i + 1] = 1

# 길이가 3 이상인 경우
for length in range(3, n + 1):
    for s in range(n - length + 1):
        e = s + length - 1
        if arr[s] == arr[e] and dp[s + 1][e - 1] == 1:
            dp[s][e] = 1

m = int(input())
for _ in range(m):
    s, e = map(int, input().split())
    # 문제에서 1부터 시작하므로 인덱스를 맞춰준다.
    print(dp[s - 1][e - 1])