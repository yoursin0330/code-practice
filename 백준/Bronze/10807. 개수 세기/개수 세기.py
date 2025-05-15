import sys

n = int(input())
nums = list(map(int, input().split()))
v=int(input())
cnt=0
for x in nums:
	if x==v:cnt+=1
print(cnt)