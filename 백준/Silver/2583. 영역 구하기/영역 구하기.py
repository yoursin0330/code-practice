import sys
input=sys.stdin.readline
sys.setrecursionlimit(10**6)

m,n,k = map(int, input().split())
board = [[0 for _ in range(n)] for _ in range(m)]
for _ in range(k):
    x1,y1,x2,y2 = map(int, input().split())
    for y in range(y1, y2):
        for x in range(x1,x2):
            board[y][x]=1

#1: 칠해짐, 0: 미방문, -1: 방문
mv = [[1,0],[0,1],[-1,0],[0,-1]]
arr=[]
def dfs(y,x,idx):
    for dy,dx in mv:
        ny, nx = dy+y, dx+x
        if 0<=ny<m and 0<=nx<n and board[ny][nx]==0:
            board[ny][nx]=-1
            arr[idx]+=1
            dfs(ny,nx,idx)
count = 0
for y in range(m):
    for x in range(n):
        if board[y][x]==0:
            board[y][x]=-1
            arr.append(1)
            dfs(y,x, count)
            count+=1
print(count)
arr.sort()
print(*arr)