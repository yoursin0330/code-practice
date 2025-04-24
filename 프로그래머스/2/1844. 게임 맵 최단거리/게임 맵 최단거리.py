# 최단거리 -> BFS 사용
from collections import deque
def solution(maps):
    queue = deque()
    n = len(maps)
    m = len(maps[0])
    
    # 방향 이동
    mv = [[1,0],[0,1],[-1,0],[0,-1]]
    queue.append((0,0)) # 시작점
    while queue:
        x,y = queue.popleft()
        print(x,y,maps[x][y])
        # 맵 안이고 값이 0이 아닐때
        for dx,dy in mv:
            nx, ny= x+dx, y+dy
            if 0<=nx<n and 0<=ny<m and maps[nx][ny]==1:
                maps[nx][ny] = maps[x][y] + 1
                queue.append((nx,ny))
    if maps[n-1][m-1] <= 1: return -1
    return maps[n-1][m-1]