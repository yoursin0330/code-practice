import sys
input = sys.stdin.readline
n,m = map(int, input().split())

maze = []
for _ in range(n):
    maze.append(list(map(int, input().split())))
dp = [[0 for _ in range(m)] for _ in range(n)]
dp[0][0] = maze[0][0]
for y in range(n):
    for x in range(m):
        if y>0 and x>0 : dp[y][x] = max(dp[y][x], dp[y-1][x-1], dp[y-1][x], dp[y][x-1])
        elif y>0: dp[y][x] = dp[y-1][x]
        else: dp[y][x] = dp[y][x-1]
        dp[y][x]+=maze[y][x]
print(dp[n-1][m-1])