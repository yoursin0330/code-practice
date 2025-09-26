import sys
input = sys.stdin.readline
arr = [1,1,1]
n = int(input())
for _ in range(n-1):
    tmp = [sum(arr)%9901, (arr[0]+arr[2])%9901, (arr[0]+arr[1])%9901]
    arr = tmp
print(sum(arr)%9901)