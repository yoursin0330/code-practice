from collections import deque
n = int(input())
# 정답 모양을 만드려면 배열의 가로 길이를 2*n-1로 맞춰야 합니다.
arr = [[' '] * (2 * n-1) for _ in range(n)] 
queue = deque()
queue.append((0, n - 1, n))  # 시작 위치를 (0, n-1)로 설정

while queue:
    y, x, l = queue.popleft()
    if l == 3:
        arr[y][x] = arr[y + 1][x - 1] = arr[y + 1][x + 1] = '*'
        for i in range(-2, 3):
            arr[y + 2][x + i] = '*'
    else:
        half = l // 2
        # 재귀 호출의 위치를 큐에 추가
        queue.append((y, x, half)) # 1. 위쪽 삼각형
        queue.append((y + half, x - half, half)) # 2. 왼쪽 아래 삼각형
        queue.append((y + half, x + half, half)) # 3. 오른쪽 아래 삼각형

for line in arr:
    print("".join(line))