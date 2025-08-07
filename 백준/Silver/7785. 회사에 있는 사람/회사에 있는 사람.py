import sys
input = sys.stdin.readline
n = int(input())
check = set()
for i in range(n):
    name, move = input().split()
    if move=="enter": check.add(name)
    else: check.remove(name)
for name in sorted(list(check), reverse=True):
    print(name)