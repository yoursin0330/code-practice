import sys
input=sys.stdin.readline

n = int(input())
dims = []
for i in range(n):
    r ,c = map(int, input().split())
    if not dims : dims.extend([r,c])
    else: dims.append(c) # c만 저장
dp = [[0 for _ in range(n)] for _ in range(n)]

for l in range(2, n+1):
    for i in range(n-l+1):
        j = i+l-1
        dp[i][j] = float('inf')
        # i~j 를 k 부분에서 나눠서 (i~k)*(k+1~j) 이렇게 좌우 곱할 때
        for k in range(i, j):
            cost = (dp[i][k]+dp[k+1][j]+dims[i]*dims[k+1]*dims[j+1])
            if cost < dp[i][j] : dp[i][j] = cost # 더 작으면 갱신

print(dp[0][n-1])