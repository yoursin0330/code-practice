import sys
input = sys.stdin.readline

n = int(input())

a,b = map(int, input().split())

m = int(input())
adj = [[] for _ in range(n+1)]
for _ in range(m):
    x, y = map(int, input().split())
    adj[x].append(y)
    adj[y].append(x)
visited = [False for _ in range(n+1)]
visited[a]=True
ans=-1
def dfs(now, l, visited):
    if now==b: 
        global ans
        ans = l
        return
    for next in adj[now]:
        if not visited[next]:
            visited[next]=True
            dfs(next, l+1, visited)
    visited[now]=False
dfs(a,0, visited)
print(ans)