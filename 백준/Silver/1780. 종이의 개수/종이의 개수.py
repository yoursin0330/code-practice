import sys
input = sys.stdin.readline

n = int(input())
paper =[]
for _ in range(n):
    paper.append(list(map(int, input().split())))

cnt={1:0,0:0,-1:0}

def frac(y,x,l):
    if l==1:
        cnt[paper[y][x]]+=1
        return
    tmp=paper[y][x]
    chk=True
    for i in range(l):
        for j in range(l):
            if tmp!=paper[y+i][x+j]:
                chk=False
                break
        if not chk: break
    if chk:
        cnt[tmp]+=1
    else:
        l//=3
        for i in range(3):
            for j in range(3):
                frac(y+i*l,x+j*l,l)
frac(0,0,n)
print(cnt[-1])
print(cnt[0])
print(cnt[1])