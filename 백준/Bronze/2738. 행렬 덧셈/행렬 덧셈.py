import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = [[0 for _ in range(m)] for _ in range(n)]

for _ in range(2):
    for y in range(n):
        l = list(map(int, input().split()))
        for x in range(m):
            arr[y][x]+=l[x]

for y in range(n):
    for x in range(m):
        print(arr[y][x], end=" ")
    print()