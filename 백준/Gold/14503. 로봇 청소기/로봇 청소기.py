import sys
input = sys.stdin.readline

n,m = map(int, input().split())
r, c, d = map(int, input().split()) # 로봇청소기 초기 위치, 방향
mv = [[-1,0],[0,1],[1,0],[0,-1]]

board = []
for _ in range(n):
    board.append(list(map(int, input().split())))
cnt=0
while True:
    if board[r][c]==0: # 청소 필요
        board[r][c]=-1 # 청소 완
        cnt+=1
    else:
        isMv=False
        for _ in range(4):
            d = (d+3)%4
            ny, nx = r+mv[d][0], c+mv[d][1]
            if n>ny>=0 and m>nx>=0 and board[ny][nx]==0:
                r, c = ny, nx
                isMv=True
                break
        if isMv: continue
        # 청소되지 않은 빈칸 x
        # 후진
        ny, nx = r+mv[(d+2)%4][0], c+mv[(d+2)%4][1]
        if n>ny>=0 and m>nx>=0 and board[ny][nx]<1:
            r,c = ny, nx
        else: break
print(cnt)