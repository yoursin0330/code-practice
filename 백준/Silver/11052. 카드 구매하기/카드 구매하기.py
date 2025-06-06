import sys
input = sys.stdin.readline

n = int(input())

cards = [0]+list(map(int, input().split())) # 1 ~ n

for i in range(1,n+1): #1 ~ n까지 인덱스
    for next in range(i,n-i+1): 
        if cards[i]+cards[next] > cards[i+next]:
            cards[i+next] = cards[i]+cards[next]
print(cards[n])