import sys, heapq
input= sys.stdin.readline

n,k = map(int, input().split())
x= []
for _ in range(n):
    x.append(int(input()))
x.sort(reverse=True)

left, right = min(x), 1000000001
res = 0

while left<=right:
    mid = (left+right)//2
    sum=0
    for v in x:
        if mid>=v: sum+=(mid-v)
    if k>=sum:
        res=mid
        left=mid+1
    else:
        right = mid-1
print(res)