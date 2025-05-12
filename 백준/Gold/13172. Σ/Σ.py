import sys
import math

MOD = 1_000_000_007

# a의 b승을 MOD로 나눈 값 (빠른 제곱, 분할정복)
def mod_pow(a, b, mod):
    result = 1
    a %= mod
    while b:
        if b % 2:
            result = result * a % mod
        a = a * a % mod
        b //= 2
    return result

# 최대공약수
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

# 입력
M = int(sys.stdin.readline())
total = 0

for _ in range(M):
    N, S = map(int, sys.stdin.readline().split())
    
    # 기약분수 만들기
    g = gcd(N, S)
    N //= g
    S //= g

    # N의 모듈러 역원 구하기
    N_inv = mod_pow(N, MOD - 2, MOD)

    # S * N^-1 mod MOD
    term = S * N_inv % MOD
    total = (total + term) % MOD

print(total)
