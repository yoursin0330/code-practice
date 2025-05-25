import sys
input = sys.stdin.readline

check = [False for _ in range(30)]
for _ in range(28):
    check[int(input())-1]=True
for i in range(30):
    if not check[i] : print(i+1)