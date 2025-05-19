import sys
input= sys.stdin.readline

n,m = map(int, input().split())
num = sorted(set(map(int, input().split())))
arr=[]

def dfs(start, depth):
    if depth==m:
        print(*arr)
        return
    for i in range(start, len(num)):
        arr.append(num[i])
        dfs(i, depth+1)
        arr.pop()

dfs(0,0)