import sys
input=sys.stdin.readline
n=int(input())
nums = [False for _ in range(n+1)]
arr=[]
def dfs():
    if len(arr)==n:
        print(*arr)
    else:
        for i in range(1, n+1):
            if not nums[i]:
                arr.append(i)
                nums[i]=True
                dfs()
    if arr: 
        nums[arr.pop()]=False
dfs()