import sys
from collections import deque
input = sys.stdin.readline

r, c = map(int, input().split())
board = [input().rstrip() for _ in range(r)]

# 알파벳을 0~25 정수로 바꿔서
A = [[ord(ch) - 65 for ch in row] for row in board]
dirs = [(-1,0),(1,0),(0,-1),(0,1)]

# (y, x)마다 방문한 mask들을 저장할 set
visited = [[set() for _ in range(c)] for __ in range(r)]

start_mask = 1 << A[0][0]
dq = deque([(0, 0, start_mask, 1)])
visited[0][0].add(start_mask)

ans = 1
while dq:
    y, x, mask, depth = dq.popleft()
    # 최대 거리 갱신
    if depth > ans:
        ans = depth

    for dy, dx in dirs:
        ny, nx = y + dy, x + dx
        if 0 <= ny < r and 0 <= nx < c:
            bit = 1 << A[ny][nx]
            # 아직 밟은 알파벳이 아니면
            if not (mask & bit):
                new_mask = mask | bit
                # 같은 (위치, mask)상태를 한 번만 탐색
                if new_mask not in visited[ny][nx]:
                    visited[ny][nx].add(new_mask)
                    dq.append((ny, nx, new_mask, depth + 1))

print(ans)