import sys
input = sys.stdin.readline
N = int(input())
arr=sorted(list(map(int, input().split())))
X= int(input())
check = [False for _ in range(X//2+2)]
idx=0
cnt=0
while idx<N:
    num = arr[idx]
    if num>=X: break
    elif num<X//2:
        check[num]=True
    elif num==X//2 and X%2==1: 
        check[num]=True
    elif check[X-num]: 
        cnt+=1
    idx+=1
print(cnt)