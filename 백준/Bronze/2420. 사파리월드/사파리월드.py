import sys, math
input = sys.stdin.readline
a,b = map(int, input().split())
print(int(math.fabs(a-b)))