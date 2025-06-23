import sys
input = sys.stdin.readline

t = int(input())
ans = [0]*t
for idx in range(t):
    n = int(input())
    
    arr = [0 for _ in range(n+1)] # 서류 -> 면접 등수
    for i in range(1, n+1):
        a,b = map(int, input().split())
        arr[a]=b
    
    cnt =1
    min_speak = arr[1] # 서류 1등 무조건 채용 -> 최소 면접 등수
    
    for i in range(2, n+1):
        if arr[i]<min_speak:
            cnt+=1
            min_speak=arr[i]
    ans[idx] = cnt
for x in ans:
    print(x)