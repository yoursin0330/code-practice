import sys
input = sys.stdin.readline

board = []
blanks = [] # 빈칸 좌표 (queue 대신 사용)

for i in range(9):
    row = list(map(int, input().split()))
    board.append(row)
    for j in range(9):
        if row[j] == 0:
            blanks.append((i, j))

# 특정 위치에 숫자를 놓을 수 있는지 확인하는 함수
def is_promising(y, x, num):
    # 가로줄 검사
    if num in board[y]:
        return False
    
    # 세로줄 검사
    for i in range(9):
        if board[i][x] == num:
            return False
            
    # 3x3 네모 검사
    sy, sx = (y // 3) * 3, (x // 3) * 3
    for i in range(sy, sy + 3):
        for j in range(sx, sx + 3):
            if board[i][j] == num:
                return False
                
    return True

def solve(k):
    # Base Case: 모든 빈칸을 다 채웠으면 성공
    if k == len(blanks):
        # 스도쿠 판 출력 후 시스템 종료
        for row in board:
            print(*row) # print(" ".join(map(str, row))) 와 동일
        sys.exit(0)

    # 현재 채워야 할 빈칸의 좌표
    y, x = blanks[k]
    
    # 1부터 9까지의 숫자를 시도
    for num in range(1, 10):
        # 해당 숫자가 유망하다면
        if is_promising(y, x, num):
            board[y][x] = num  # 숫자 배치 (일단 시도)
            solve(k + 1)       # 다음 빈칸으로 재귀 호출
            board[y][x] = 0    # 실패 시 원상 복구 (백트래킹)

# 첫 번째 빈칸부터 탐색 시작
solve(0)