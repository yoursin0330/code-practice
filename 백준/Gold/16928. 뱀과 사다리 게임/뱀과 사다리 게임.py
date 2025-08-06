import sys
input = sys.stdin.readline

N,M = map(int, input().split())
ladder = dict()
snake = dict()

for _ in range(N):
    u,v = map(int, input().split())
    ladder[u] = v
for _ in range(M):
    u,v = map(int, input().split())
    snake[u] = v

map = [100 for _ in range(101)]
map[1]=0
i=1
while i<101:
    if i in ladder:
        map[ladder[i]] = min(map[i], map[ladder[i]])
    if i in snake:
        if map[snake[i]] > map[i]:
            map[snake[i]] = map[i]
            map[i]=100
            i = snake[i]
            continue
        else: map[i]=100
    for dice in range(1,7):
        if i+dice<101:
            map[i+dice] = min(map[i]+1, map[i+dice])
    i+=1

print(map[100])