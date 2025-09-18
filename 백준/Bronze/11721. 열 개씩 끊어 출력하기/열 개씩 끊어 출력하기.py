import sys, math
input = sys.stdin.readline
arr = input().rstrip()
l = len(arr)
for i in range(math.ceil(l/10)):
    print(arr[i*10:i*10+10])