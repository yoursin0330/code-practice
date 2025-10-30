import sys
input = sys.stdin.readline
n = int(input()) #스위치 개수
switch = list(map(int, input().split())) # 스위치 상태
ppl = int(input())
for _ in range(ppl):
    gen, x = map(int, input().split())
    if gen==1: ## 남학생
        i=x-1
        while i<n:
            switch[i] = 1-switch[i]
            i+=x
    else : ## 여학생
        x-=1
        switch[x]=1-switch[x]
        for i in range(1,min(x+1, n-x)):
            if switch[x-i]!=switch[x+i]: break
            switch[x-i] = switch[x+i] = 1-switch[x+i]
for i in range((n-1)//20+1):
    print(*switch[i*20:min((i+1)*20,n)])