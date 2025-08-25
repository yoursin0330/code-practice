import sys
input = sys.stdin.readline

n,m = map(int, input().split())
nums = sorted(list(map(int, input().split())))
arr=[]
def dfs(now):
    if len(arr)==m:
        print(*arr)
    else:
        for i in range(now, n):
            arr.append(nums[i])
            dfs(i)
    if arr: arr.pop()

dfs(0)