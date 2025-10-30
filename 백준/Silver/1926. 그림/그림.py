import sys
input=sys.stdin.readline
sys.setrecursionlimit(10**6)
n,m = map(int, input().split())
graph =[]
for _ in range(n):
    graph.append(list(map(int, input().split())))
mv=[[-1,0],[0,-1],[1,0],[0,1]]
picture=[]
def dfs(y,x,idx):
    graph[y][x]=-1
    picture[idx]+=1
    for dy, dx in mv:
        ny,nx = dy+y, dx+x
        if 0<=ny<n and 0<=nx<m and graph[ny][nx]==1:
            dfs(ny,nx,idx)
idx=0
for y in range(n):
    for x in range(m):
        if graph[y][x]==1:
            picture.append(0)
            dfs(y,x,idx)
            idx+=1
print(idx)
print(0 if idx==0 else max(picture))