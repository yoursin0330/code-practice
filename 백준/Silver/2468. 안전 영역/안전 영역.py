import sys
sys.setrecursionlimit(10**6)
input= sys.stdin.readline

n = int(input())

graph=[]
max_height=0
min_height=100

for _ in range(n):
    arr = list(map(int, input().split()))
    max_height = max(max_height, max(arr))
    min_height = min(min_height, min(arr))
    graph.append(arr)

cnt=[n*n]
max_area=1

mv = [(-1,0),(1,0),(0,-1),(0,1)]

def dfs(y,x,h,visited, cnt):
    cnt[0]+=1
    visited[y][x]=True
    for dy,dx in mv:
        ny,nx =dy+y, dx+x
        if 0<=ny<n and 0<=nx<n and graph[ny][nx]>h and not visited[ny][nx]:
            dfs(ny,nx,h, visited, cnt)

for h in range(min_height, max_height+1):
    if cnt[0] <= max_area: break
    area, cnt[0] = 0,0
    visited = [[False for _ in range(n)] for _ in range(n)]
    for y in range(n):
        for x in range(n):
            if graph[y][x]>h and not visited[y][x]: 
                dfs(y, x, h, visited, cnt)
                area+=1
    max_area = max(max_area, area)

print(max_area)