import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
board=[[0 for _ in range(n)] for _ in range(n)]
shark=[0,0]

for i in range(n):
    arr = list(map(int, input().split()))
    for j in range(n):
        if arr[j]==9 :
            shark[0]=i
            shark[1]=j
        elif arr[j]>0: board[i][j] = arr[j]
t=0
size=2 # 상어 크기

mv = [[-1,0],[0,-1],[0,1],[1,0]]
samesizecnt=0

while True:
    fish=[]
    stack=deque([shark])
    visited = [[-1 for _ in range(n)] for _ in range(n)] # 미방문 -1
    visited[shark[0]][shark[1]]=0
    while stack:
        y,x= stack.popleft()
        for dy, dx in mv:
            ny, nx = dy+y, dx+x
            if 0<=ny<n and 0<=nx<n and visited[ny][nx]==-1 and board[ny][nx]<=size: #미방문
                visited[ny][nx] = visited[y][x]+1
                if size>board[ny][nx]>0 : fish.append((visited[ny][nx], ny,nx))
                stack.append((ny,nx))
    if len(fish)==0 : break # 먹을 수 있는 물고기x
    else:
        fish.sort()
        dist, ny, nx = fish.pop(0)
        t += dist
        samesizecnt+=1
        if samesizecnt==size: 
            size+=1
            samesizecnt=0
        board[ny][nx]=0
        shark[0]=ny
        shark[1]=nx
print(t)