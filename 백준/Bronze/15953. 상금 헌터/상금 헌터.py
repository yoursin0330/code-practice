t = int(input())
for _ in range(t):
    a,b = map(int, input().split())
    sum=0
    if a>21 or a==0: sum+=0
    elif a<=1: sum+=500
    elif a<=3: sum+=300
    elif a<=6: sum+=200
    elif a<=10: sum+=50
    elif a<=15: sum+=30
    else : sum+=10
    if b>31 or b==0: sum+=0
    elif b<=1: sum+=512
    elif b<=3: sum+=256
    elif b<=7: sum+=128
    elif b<=15: sum+=64
    else : sum+=32
    print(sum*10000)