import math
a,b,c = map(int, input().split())
if c<=b: print(-1)
else:
    x = int(math.ceil(a/(c-b)))
    if a>=(c-b)*x:
        x+=1
    print(x)