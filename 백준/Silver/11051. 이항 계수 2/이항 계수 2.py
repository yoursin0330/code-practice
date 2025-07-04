import sys
input = sys.stdin.readline
n, k = map(int, input().split())
k = min(n-k, k)
bunmo=1
bunja=1
for i in range(k):
    bunmo = bunmo*(n-i)
    bunja= bunja*(i+1)
print((bunmo//bunja)%10007)