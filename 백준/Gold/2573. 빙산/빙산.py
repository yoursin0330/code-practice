import sys
sys.setrecursionlimit(10**6)
input=sys.stdin.readline

n,m=map(int, input().split())

graph=[[0 for _ in range(m)] for _ in range(n)]
ice = [] # 빙하 좌표
for i in range(n):
    arr = list(map(int, input().split()))
    for j in range(m):
        if arr[j]>0:
            ice.append([i,j,arr[j]]) # y, x, 값
            graph[i][j] = arr[j]
mv = [(-1,0),(1,0),(0,-1),(0,1)]

def dfs(y,x, visited):
    visited[y][x]=True
    for dy,dx in mv:
        ny,nx =dy+y, dx+x
        if 0<=ny<n and 0<=nx<m and graph[ny][nx]>0 and not visited[ny][nx]:
            dfs(ny,nx, visited)

def melt(ice):
    time=0
    while ice:
        time+=1
        # 분해
        for idx in range(len(ice)):
            y,x,val = ice[idx][0], ice[idx][1], ice[idx][2]
            for dy,dx in mv:
                if graph[dy+y][dx+x]==0: 
                    val-=1
            
            ice[idx][2] = max(0,val)
        newice=[]
        while ice:
            y,x,val = ice.pop()
            graph[y][x]=val
            if val> 0: newice.append([y,x,val])
        ice=newice
        # 한 덩이인지 체크 - 한 덩이 아니면 break
        visited = [[False for _ in range(m)] for _ in range(n)]
        check=False
        for y, x, _ in ice:
            if not visited[y][x] :
                if check: return time
                dfs(y,x, visited)
                check=True
    return 0
print(melt(ice))