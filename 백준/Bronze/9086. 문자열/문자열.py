import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
    arr = input().rstrip()
    print(arr[0]+arr[-1])