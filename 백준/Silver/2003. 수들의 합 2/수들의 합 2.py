import sys
input=sys.stdin.readline
n,m = map(int, input().split())
sum=[0]
tmp=0
for x in list(map(int, input().split())):
    tmp+=x
    sum.append(tmp)

start, end = 0,1
cnt=0

while end<=n:
    sumval = sum[end]-sum[start]
    if sumval <= m:
        if sumval ==m: cnt+=1
        end+=1
    else: start+=1
print(cnt)