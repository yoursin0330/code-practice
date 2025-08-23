import math
arr = []

for _ in range(2):
    arr.append(list(map(int, input().split())))

bunmo = math.lcm(arr[0][1], arr[1][1])
bunja = arr[0][0]*(bunmo//arr[0][1])+arr[1][0]*(bunmo//arr[1][1])

gcdvalue = math.gcd(bunmo, bunja)

print(bunja//gcdvalue, bunmo//gcdvalue)