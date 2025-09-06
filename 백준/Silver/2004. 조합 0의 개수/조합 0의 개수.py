import sys

def count_prime_in_factorial(n, p):
    count = 0
    while n != 0:
        n //= p
        count += n
    return count

n, m = map(int, sys.stdin.readline().split())
    
# nCr = n! / ((n-m)! * m!)
# 따라서 nCr에 포함된 소수 p의 개수는
# (n!에 포함된 p의 개수) - ((n-m)!에 포함된 p의 개수) - (m!에 포함된 p의 개수)

count_two = count_prime_in_factorial(n, 2) - count_prime_in_factorial(n - m, 2) - count_prime_in_factorial(m, 2)
count_five = count_prime_in_factorial(n, 5) - count_prime_in_factorial(n - m, 5) - count_prime_in_factorial(m, 5)

print(min(count_two, count_five))