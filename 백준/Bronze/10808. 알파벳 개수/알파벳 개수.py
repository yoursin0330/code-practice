cnt = [0 for _ in range(26)]
for x in list(input().rstrip()):
    cnt[ord(x)-97]+=1
print(*cnt)