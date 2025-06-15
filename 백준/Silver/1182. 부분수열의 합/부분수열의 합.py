import sys
input = sys.stdin.readline

n, s= map(int, input().split())
# 정수 n개 수열, 합이 s가 되는 부분수열
arr = [0]+list(map(int, input().split()))
cnt = 0

# 그냥 모두 트라이하기 - 백트래킹으로....
# visited 없이 이전 인덱스보다 이후로 함 (겹치는 거 x)

def dfs(now, sum):
    if sum==s: 
        global cnt
        cnt+=1
    if now == n: return
    for i in range(now+1, n+1):
        dfs(i, sum+arr[i])

dfs(0,0)
if s==0:cnt-=1
print(cnt)