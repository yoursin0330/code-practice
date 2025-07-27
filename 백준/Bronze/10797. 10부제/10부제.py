n=int(input())
cnt=0
for x in list(map(int, input().split())):
    if x==n: cnt+=1
print(cnt)