a, b = map(int, input().split())
c = int(input())
b+=c%60
if b>59 : 
    a+=1
    b-=60
a= (a+c//60)%24
print(f'{a} {b}')