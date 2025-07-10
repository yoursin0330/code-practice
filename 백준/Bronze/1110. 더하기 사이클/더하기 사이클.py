import sys
input = sys.stdin.readline

n = int(input())
x=n
cnt=0
while True:
    cnt+=1
    x= (x%10)*10+ (x//10+x%10)%10
    if x==n: break
print(cnt)