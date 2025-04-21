import sys
input = sys.stdin.readline
a,b = map(int, input().split())
cnt = 1
while b>a:
    if b%2==0:
        cnt+=1
        b/=2
    elif b%10==1:
        cnt+=1
        b//=10
    else: break
if a!=b: print(-1)
else : print(cnt)