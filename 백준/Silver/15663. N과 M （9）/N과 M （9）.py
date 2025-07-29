import sys
input = sys.stdin.readline

def dfs(depth):
    if depth == M:
        print(*picked)
        return

    prev = None
    for i in range(N):
        if not visited[i] and nums[i] != prev:
            visited[i] = True
            picked.append(nums[i])
            dfs(depth + 1)
            picked.pop()
            visited[i] = False
            prev = nums[i]

N, M = map(int, input().split())
nums = sorted(map(int, input().split()))
visited = [False] * N
picked = []

dfs(0)
