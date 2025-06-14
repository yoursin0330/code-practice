import sys, math
input = sys.stdin.readline

x = int(input())
n=0
i=0
while i<x:
    i+=n
    n+=1
i-=n
n-=1
if n%2==1: print(f'{n-(x-i)+2}/{(x-i)-1}')
else : print(f'{(x-i)-1}/{n-(x-i)+2}')