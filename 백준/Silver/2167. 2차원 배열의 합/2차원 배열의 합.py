import sys
n,m = map(int, input().split())
arr = [[0 for _ in range(m)] for _ in range(n)]
for y in range(n):
    tmp = list(map(int, input().split()))
    for x in range(m):
        arr[y][x] = tmp[x]
        if y>0: arr[y][x]+=arr[y-1][x]
        if x>0: 
            arr[y][x]+=arr[y][x-1]
            if y>0: arr[y][x]-=arr[y-1][x-1]
k = int(input())
for _ in range(k):
    j,i,y,x =map(int, input().split())
    ans = arr[y-1][x-1]
    if j > 1:
        ans -= arr[j-2][x-1]
    if i > 1:
        ans -= arr[y-1][i-2]
    if j > 1 and i > 1:
        ans += arr[j-2][i-2]
    print(ans)