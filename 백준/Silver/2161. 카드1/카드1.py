from collections import deque
import sys

n = int(sys.stdin.readline())

cards = deque(i for i in range(1, n+1))
while cards:
    print(cards.popleft(), end=" ")
    if cards : cards.append(cards.popleft())