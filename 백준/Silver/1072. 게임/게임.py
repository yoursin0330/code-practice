import sys, math
input = sys.stdin.readline
x,y = map(int, input().split())

z_start = math.floor(100*y/x)

left, right=0, x
ans=-1
if y==x:
    print(-1)
else:
    while left<=right:
        mid = (left+right)//2
        z_now = math.floor(100*(y+mid)/(x+mid))
        if z_now>z_start:
            ans=mid
            right = mid-1
        else: 
            left=mid+1
    print(ans)