def solution(n):
    arr=[]
    for i in range(1, n+1):
        arr.append([0 for _ in range(i)])
    cnt = sum(i for i in range(1,n+1))
    dx = [0,1,-1]
    dy = [1,0,-1]
    idx=1
    mv=0
    y,x=0,0
    while idx<=cnt:
        arr[y][x]=idx
        nx, ny = x+dx[mv], y+dy[mv]
        if nx == n or ny == n or nx<0 or ny<0 or arr[ny][nx]>0 :
            # 방향 바꾸기
            mv = (mv+1)%3
            nx, ny = x+dx[mv], y+dy[mv]
        idx+=1
        x,y = nx,ny
    ans = []
    for l in arr:
        for v in l:
            ans.append(v)
    return ans