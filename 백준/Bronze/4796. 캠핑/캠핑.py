import sys
input = sys.stdin.readline
i=0
while True:
    i+=1
    L,P,V = map(int, input().split())
    if L==0: break
    print(F'Case {i}: {(V//P)*L + min(V%P, L)}')