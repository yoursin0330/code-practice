import sys
input = sys.stdin.readline

n, m =map(int, input().split())
num = list(map(int, input().split()))
num.sort()

arr =[]

def dfs(num):
    if len(arr)==m:
        print(*arr)
        return
    for i in range(n):
        if num[i] not in arr:
            arr.append(num[i])
        else:
            continue
        dfs(num)
        arr.pop()
dfs(num)