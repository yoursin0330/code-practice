import sys
input = sys.stdin.readline

n,m = map(int, input().split())

# 1~n 자연수 중 m개 고른 수열, 같은 수 여러번 가능
# 순서는 사전 순으로 증가
arr = []
def dfs(len):
    if len == m: 
        print(*arr)
    else:
        for x in range(1, n+1):
            arr.append(x)
            dfs(len+1)
    if arr: arr.pop()

dfs(0)