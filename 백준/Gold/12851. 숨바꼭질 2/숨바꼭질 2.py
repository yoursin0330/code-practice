from collections import deque

def bfs(n, k):
    max_size = 100001
    visited = [float('inf')] * max_size  # 각 위치에 도달한 최소 시간
    queue = deque()
    queue.append((n, 0))  # (현재 위치, 시간)
    visited[n] = 0

    min_time = float('inf')
    count = 0

    while queue:
        now, time = queue.popleft()

        # 가지치기: 이미 최소 시간보다 더 늦게 도착한 경로는 무시
        if time > min_time:
            continue

        if now == k:
            if time < min_time:
                min_time = time
                count = 1
            elif time == min_time:
                count += 1
            continue  # 동생 위치에서의 이동은 더 볼 필요 없음

        for next_pos in [now - 1, now + 1, now * 2]:
            if 0 <= next_pos < max_size:
                # 현재보다 더 빠르거나 같은 시간에 갈 수 있으면 큐에 추가
                if visited[next_pos] >= time + 1:
                    visited[next_pos] = time + 1
                    queue.append((next_pos, time + 1))

    return min_time, count

# 입력
n, k = map(int, input().split())
min_time, ways = bfs(n, k)
print(min_time)
print(ways)