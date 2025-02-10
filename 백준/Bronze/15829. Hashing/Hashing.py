l=int(input())
ans=0
line=list(input())
for i in range(l):
    ans+=(ord(line[i])-ord('a')+1)*31**i
print(ans)   