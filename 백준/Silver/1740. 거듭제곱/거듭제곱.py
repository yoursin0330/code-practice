import sys
input = sys.stdin.readline

n = int(input())
ans=0
idx=1
while n>1:
    ans+=(n%2)*idx
    n//=2
    idx*=3
ans+=n*idx
print(ans)