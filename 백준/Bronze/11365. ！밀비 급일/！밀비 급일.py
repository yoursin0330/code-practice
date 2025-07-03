import sys
input = sys.stdin.readline
while True:
	arr = input().rstrip()
	if arr == "END" : break
	print(arr[::-1])