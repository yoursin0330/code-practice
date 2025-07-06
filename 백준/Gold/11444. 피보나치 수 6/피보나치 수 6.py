import sys
from collections import defaultdict
input= sys.stdin.readline

def F(num):
    if num <=2:
        return dp[num] # 저장해 둔 데이터를 사용
    elif dp[num] >0:
        return dp[num]
    # 존재하지 않음 -> 연산 필요
    
    else:
        half = num//2
        if num%2==0: # 짝수
            h0 = F(half)
            h1 = F(half -1)
            dp[num] = ((2*h1 + h0)*h0) %1000000007
            return dp[num]
        else: #홀수
            h0 = F(half+1)
            h1 = F(half)
            dp[num] = (h0**2 + h1**2)%1000000007
            return dp[num]
n = int(input())
dp = defaultdict(int)
dp[1], dp[2] = 1,1

print(F(n))