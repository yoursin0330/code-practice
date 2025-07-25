import sys
input=sys.stdin.readline
while True:
    arr = list(map(int, input().split()))
    if arr[0]==0: break
    k = arr[0]
    s = sorted(arr[1:])
    
    def dfs(now, len, k, s, ans):
        ans.append(s[now])
        if len==6:
            print(*ans)
        else:
            for x in range(now+1, k):
                dfs(x, len+1, k,s, ans)
        if ans: ans.pop()
    ans=[]
    for x in range(k-5):
        dfs(x,1,k,s,ans)
    print()