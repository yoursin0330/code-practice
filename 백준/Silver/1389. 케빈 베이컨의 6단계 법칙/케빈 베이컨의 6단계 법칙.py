import sys
from collections import deque
input=sys.stdin.readline

n, m = map(int, input().split())
adj = [[n for _ in range(n+1)] for _ in range(n+1)]

for i in range(1, n+1):
    adj[i][i] = 0

for _ in range(m):
    a,b = map(int, input().split())
    adj[a][b] = 1
    adj[b][a] = 1

for k in range(1, n+1):
    for i in range(1, n+1):
        for j in range(1, n+1):
            adj[i][j] = min(adj[i][j], adj[i][k]+adj[k][j])

ppl=int(1e9)
answer=0
for i in range(n, 0, -1):
    s = sum(adj[i][1:])
    if s<=ppl:
        ppl = s
        answer = i
print(answer)