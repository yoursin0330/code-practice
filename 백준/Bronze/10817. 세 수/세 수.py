import sys
input = sys.stdin.readline
num = list(map(int, input().split()))
num.sort()
print(num[1])