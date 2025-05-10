import sys
input= sys.stdin.readline

n = int(input())
dp=[[0,0] for _ in range(n+1)]
answer=0
for i in range(1,n+1):
    dp[i] = list(map(int,input().split())) # t, p
    maxsum= max((x[1] for x in dp[:i] if x[0]<=i), default=0)

    dp[i][1] += maxsum
    dp[i][0] += i

print(max(filter(lambda x : x[0]<=n+1, dp), key = lambda x : x[1])[1])