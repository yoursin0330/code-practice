import sys, heapq,math
input=sys.stdin.readline

dice = list(map(int, input().split()))
dice.sort()

if dice[0]==dice[1]==dice[2]:
    print(dice[0]*1000+10000)
elif dice[0]==dice[1] or dice[1]==dice[2]:
    print(dice[1]*100+1000)
else:
    print(dice[2]*100)