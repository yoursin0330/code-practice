import sys
sys.setrecursionlimit(10000)
input = sys.stdin.readline

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

def dfs(start, now, visited):
    for next in range(n):
        if not visited[next] and graph[now][next]:
            graph[start][next] = 1  # start에서 next로 도달 가능
            visited[next] = True
            dfs(start, next, visited)

for i in range(n):
    visited = [False] * n
    dfs(i, i, visited)

for row in graph:
    print(' '.join(map(str, row)))
