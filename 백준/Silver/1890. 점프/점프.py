import sys
input=sys.stdin.readline

n = int(input())

arr = []
for _ in range(n):
    arr.append(list(map(int, input().split())))
dp = [[0 for _ in range(n)]for _ in range(n)]
dp[0][0]=1
for y in range(n):
    for x in range(n):
        if dp[y][x]>0 and arr[y][x]>0:
            if y+arr[y][x]<n: dp[y+arr[y][x]][x]+=dp[y][x]
            if x+arr[y][x]<n: dp[y][x+arr[y][x]]+=dp[y][x]

print(dp[n-1][n-1])