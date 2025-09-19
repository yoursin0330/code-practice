n = int(input())
before = [1 for _ in range(10)]
before[0]=0

for _ in range(n-1):
    now = [0 for _ in range(10)]
    now[0] = before[1]
    now[9] = before[8]
    for i in range(1,9):
        now[i] = (before[i-1]+before[i+1])%1000000000
    before = now
print(sum(before)%1000000000)