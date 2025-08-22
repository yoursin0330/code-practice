import sys
input = sys.stdin.readline

n,m = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()
arr = []
def dfs(now):
    if len(arr) == m:
        print(*arr)
    else:
        for x in range(now+1, n):
            arr.append(nums[x])
            dfs(x)
    if arr: arr.pop()
dfs(-1)