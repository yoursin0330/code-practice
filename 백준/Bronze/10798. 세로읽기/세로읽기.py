import sys
input = sys.stdin.readline
arr =[]
max_x=0
for _ in range(5):
    string = input().rstrip()
    max_x = max(max_x, len(string))
    arr.append(list(string))
for x in range(max_x):
    for y in range(5):
        if len(arr[y])>x:
            print(arr[y][x], end="")