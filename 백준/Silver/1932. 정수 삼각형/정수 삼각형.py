import sys
input=sys.stdin.readline
n=int(input())
triangle = []
for _ in range(n):
    triangle.append(list(map(int, input().split())))

for x in range(n-1, -1, -1):
    for k in range(x):
        triangle[x-1][k]+=max(triangle[x][k+1], triangle[x][k])
        
print(triangle[0][0])