import math

m = int(input())
n = int(input())
arr = []

for x in range(m, n+1):
    if x < 2:  # 0이나 1은 소수 아님
        continue
    chk = True
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            chk = False
            break
    if chk:
        arr.append(x)

if len(arr) == 0:
    print(-1)
else:
    print(sum(arr))
    print(arr[0])
