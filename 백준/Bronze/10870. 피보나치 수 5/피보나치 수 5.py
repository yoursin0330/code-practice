import sys
input = sys.stdin.readline

n = int(input())

dp = [0,1]
for _ in range(n-1): dp.append(dp[-1]+dp[-2])
print(0 if n==0 else dp[-1])