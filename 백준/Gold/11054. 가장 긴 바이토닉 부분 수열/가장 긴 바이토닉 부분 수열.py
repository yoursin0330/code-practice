import sys
input = sys.stdin.readline

n = int(input())
up = [1 for _ in range(n)] # ~ i번째까지 가장 긴 증가 수열 길이
down = [1 for _ in range(n)] # i ~ 끝까지 가장 긴 감소 수열 길이

arr = list(map(int, input().split()))

## 증가하는 부분수열 최대 길이
for i in range(n):
    for j in range(i):
        if arr[j]<arr[i]: up[i] = max(up[i], up[j]+1)

## 감소하는 부분수열 최대 길이
for i in range(n-1, -1, -1):
    for j in range(n-1, i, -1):
        if arr[j]<arr[i]: down[i] = max(down[i], down[j]+1)

ans = 0
for i in range(n):
    ans = max(up[i]+down[i]-1, ans)
print(ans)