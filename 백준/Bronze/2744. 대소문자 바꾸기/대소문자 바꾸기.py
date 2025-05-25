import sys
input = sys.stdin.readline

arr = input().rstrip()
for x in arr:
    if x.islower() : print(x.upper(), end="")
    else: print(x.lower(), end="")