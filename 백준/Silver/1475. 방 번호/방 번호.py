import sys, math
input = sys.stdin.readline

cnt = [0 for _ in range(10)]
for x in list(input().rstrip()):
    cnt[int(x)]+=1

cnt[6] = int(math.ceil((cnt[6]+cnt[9])/2))
cnt[9]=0
print(max(cnt))