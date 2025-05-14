import sys
input = sys.stdin.readline

maxcnt=0
n = int(input())
board=[]

for _ in range(n):
    board.append(list(input().rstrip()))

def checkarr(board, x):
    global maxcnt
    secnt=1
    for j in range(1,n):
        if board[j-1][x]!=board[j][x]:
            maxcnt = max(secnt, maxcnt)
            secnt=1
        else :
            secnt+=1
        maxcnt = max(secnt, maxcnt)

def checkcol(board, y):
    global maxcnt
    gacnt=1
    for j in range(1,n):
        if board[y][j-1]!=board[y][j]:
            maxcnt = max(gacnt, maxcnt)
            gacnt=1
        else :
            gacnt+=1
    maxcnt = max(gacnt, maxcnt)

for i in range(n):
    gacnt=1
    secnt=1
    
    for j in range(1,n):
        if board[i][j-1]!=board[i][j]:
            maxcnt = max(gacnt, maxcnt)
            gacnt=1
        else :
            gacnt+=1
        if board[j-1][i]!=board[j][i]:
            maxcnt = max(secnt, maxcnt)
            secnt=1
        else :
            secnt+=1
        maxcnt = max(gacnt, secnt, maxcnt)

#change with only right, below
for y in range(n-1):
    for x in range(n-1):
        if board[y][x] != board[y+1][x]:
            # below
            board[y][x], board[y+1][x] =  board[y+1][x], board[y][x]
            checkcol(board,y)
            checkcol(board,y+1)
            checkarr(board,x)
            board[y][x], board[y+1][x] =  board[y+1][x], board[y][x]
        
        #right
        if board[y][x] != board[y][x+1]:
            board[y][x], board[y][x+1] =  board[y][x+1], board[y][x]
            checkcol(board,y)
            checkarr(board,x)
            checkarr(board,x+1)
            board[y][x], board[y][x+1] =  board[y][x+1], board[y][x]
            
            
for i in range(n-1):
    if board[i][n-1] != board[i+1][n-1]:
            # below
            board[i][n-1], board[i+1][n-1] =  board[i+1][n-1], board[i][n-1]
            checkcol(board,i)
            checkcol(board,y+1)
            checkarr(board,n-1)
            board[i][n-1], board[i+1][n-1] =  board[i+1][n-1], board[i][n-1]
        
        #right
    if board[n-1][i] != board[n-1][i+1]:
        board[n-1][i], board[n-1][i+1] =  board[n-1][i+1], board[n-1][i]
        checkcol(board,n-1)
        checkarr(board,i)
        checkarr(board,i+1)
        board[n-1][i], board[n-1][i+1] =  board[n-1][i+1], board[n-1][i]

print(maxcnt)