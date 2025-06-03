import sys, math
input=sys.stdin.readline

t = int(input())

def cal(M, N, x, y):
    for i in range(x-1, abs(M*N)//math.gcd(M,N), M):
        ny = i%N+1
        if ny==y :
            print(i+1)
            return
    print(-1)
    return

for _ in range(t):
    M, N, x, y = map(int, input().split())
    cal(M, N, x, y)