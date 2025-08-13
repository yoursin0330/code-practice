time=0
for x in input().rstrip():
    if x<'D': time+=3
    elif x<'G':time+=4
    elif x<'J':time+=5
    elif x<'M':time+=6
    elif x<'P':time+=7
    elif x<'T':time+=8
    elif x<'W':time+=9
    else: time+=10
print(time)