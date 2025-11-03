import sys
input = sys.stdin.readline

minv=100
sumv=0
for _ in range(7):
    x= int(input())
    if x%2==1: 
        sumv+=x
        minv = min(x,minv)
if sumv==0: print(-1)
else:
    print(sumv)
    print(minv)