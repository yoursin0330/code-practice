import sys
n = int(input())
before = [1 for _ in range(10)]
now = [1 for _ in range(10)]

for _ in range(n-1):
    now[0] = before[0]
    for i in range(1,10):
        now[i] = (now[i-1]+before[i])%10007
    before = now
print(sum(now)%10007)