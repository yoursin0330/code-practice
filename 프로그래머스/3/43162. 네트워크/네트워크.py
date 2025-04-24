from collections import deque
def solution(n, computers):
    cnt=0
    visited = [False]*n
    queue = deque()
    for i in range(n):
        if visited[i]: continue
        visited[i]=True
        cnt+=1
        for j in range(i+1, n):
            if computers[i][j]==1 and not visited[j]:
                dfs(j, n,computers, visited)
    return cnt
def dfs(now, n, computers, visited):
    visited[now]=True
    for idx in range(n):
        if computers[now][idx]==1 and not visited[idx]:
            dfs(idx, n, computers,visited)
    return