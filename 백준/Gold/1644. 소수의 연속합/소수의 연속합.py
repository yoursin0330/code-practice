import sys

input = sys.stdin.readline

n = int(input())

# 에라토스테네스의 체로 소수 구하기
is_prime = [True] * (n + 1)
is_prime[0] = is_prime[1] = False

for i in range(2, int(n ** 0.5) + 1):
    if is_prime[i]:
        for j in range(i * i, n + 1, i):
            is_prime[j] = False

primes = [i for i, val in enumerate(is_prime) if val]

# 슬라이딩 윈도우
left = 0
right = 0
total = 0
cnt = 0

while True:
    if total >= n:
        if total == n:
            cnt += 1
        total -= primes[left]
        left += 1
    elif right == len(primes):
        break
    else:
        total += primes[right]
        right += 1

print(cnt)
