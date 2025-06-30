import sys
input = sys.stdin.readline

n = int(input())

height = list(map(int, input().split()))

ans = [0 for _ in range(n)]
stack = []

for i in range(n):
    while stack:
        if stack[-1][0] < height[i]:
            stack.pop(-1)
        else:
            ans[i] = stack[-1][1]
            break
    stack.append((height[i], i+1))
print(*ans)