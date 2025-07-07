import sys
input=sys.stdin.readline

num =0
for _ in range(5):
	num+=max(40,int(input()))
print(num//5)