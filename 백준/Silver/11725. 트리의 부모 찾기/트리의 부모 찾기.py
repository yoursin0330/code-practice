import sys
from collections import defaultdict
input=sys.stdin.readline

adj = defaultdict(list)
n = int(input())
parent = [0 for _ in range(n+1)]

for _ in range(n-1):
    a,b = map(int, input().split())
    adj[a].append(b)
    adj[b].append(a)

stack =[]
for child in adj[1]: # 1부터 트리 구성 시작
    stack.append((1, child))

while stack:
    p, c = stack.pop() #parent, child
    parent[c] = p
    adj[c].remove(p)
    for child in adj[c]:
        stack.append((c, child))
    
for i in range(2, n+1): print(parent[i])
