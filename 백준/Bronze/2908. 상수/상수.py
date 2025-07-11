import sys
input = sys.stdin.readline

arr = list(input().rstrip().split())

arr[0], arr[1] = arr[0][::-1],arr[1][::-1]

print(int(max(arr)))