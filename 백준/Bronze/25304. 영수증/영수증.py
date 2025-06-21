import sys
input = sys.stdin.readline
receipt = int(input())
n = int(input())

for _ in range(n):
	a, b = map(int, input().split())
	receipt-=a*b
print("Yes" if receipt==0 else "No")