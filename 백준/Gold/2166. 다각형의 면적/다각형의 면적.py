import sys
input=sys.stdin.readline

n = int(input())
coord = []

for _ in range(n):
    coord.append(list(map(int, input().split())))
coord.append(coord[0])

answer = 0

for i in range(n):
    answer += coord[i][0]*coord[i+1][1] - coord[i+1][0]*coord[i][1]
print(abs(answer)/2)