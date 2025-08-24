import sys
input = sys.stdin.readline
n = int(input())
if n == 1:
    print(0)
    sys.exit()

arr = []
for _ in range(n - 1):
    arr.append(list(map(int, input().split())))
k = int(input())

# dp[0][i]: 특수 점프를 사용하지 않고 i에 도달하는 최소 비용
# dp[1][i]: 특수 점프를 사용하여 i에 도달하는 최소 비용
dp = [[float('inf')] * n for _ in range(2)]
dp[0][0] = 0

# n=2, n=3 등의 작은 케이스를 명확하게 처리
dp[0][1] = arr[0][0]
if n > 2:
    dp[0][2] = min(arr[0][0] + arr[1][0], arr[0][1])
    dp[1][2] = float('inf') # 2번 돌까지는 3칸 점프가 불가능하므로 무한대로 설정

# 4번 돌부터 시작
for i in range(3, n):
    # 특수 점프를 사용하지 않은 경로
    dp[0][i] = min(dp[0][i-1] + arr[i-1][0], dp[0][i-2] + arr[i-2][1])

    # 특수 점프를 사용한 경로
    # 1. 이전 위치에서 1칸 점프
    path1 = dp[1][i-1] + arr[i-1][0]
    # 2. 이전 위치에서 2칸 점프
    path2 = dp[1][i-2] + arr[i-2][1]
    # 3. 3칸 전에서 특수 점프 사용
    path3 = dp[0][i-3] + k
    
    dp[1][i] = min(path1, path2, path3)

# 최종 결과는 두 가지 경우 중 더 작은 값
print(min(dp[0][n-1], dp[1][n-1]))