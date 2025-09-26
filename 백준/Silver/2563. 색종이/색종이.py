import sys
input = sys.stdin.readline

board = [[0 for _ in range(100)] for _ in range(100)]

k = int(input())

for _ in range(k):
    x, y = map(int, input().split())
    for j in range(y-1, y+9):
        for i in range(x-1, x+9):
            board[j][i]=1
cnt=0
for l in board:
    cnt+=sum(l)
print(cnt)