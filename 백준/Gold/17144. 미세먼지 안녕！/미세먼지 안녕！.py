import sys
r,c,t = map(int, input().split())

a = [] # r x c
airp=[] 
for y in range(r):
    # air_purifier -> -1, else -> >0
    a.append(list(map(int,input().split())))
    if a[y][0] == -1:
        airp.append(y)

stack=[]
dy = [-1,1,0,0]
dx = [0,0,-1,1]

def find_mise_spot(a, stack, r,c):
    for y in range(r):
        for x in range(c):
            if a[y][x]>0: stack.append([y,x])
    return

tmp = [0,0,0]
def air_purify():
    global airp, a
    
    # upper ----------------
    uy= airp[0] # y, # x=0
    tmp[0] = a[uy][-1]
    tmp[1] = a[0][c-1]
    tmp[2] = a[0][0]
    
    #go_right
    a[uy][1:]= [0]+a[uy][1:-1]
    
    #go_up
    for y in range(uy-1):
        a[y][c-1] = a[y+1][c-1]
    a[uy-1][c-1]=tmp[0]
    #go_left
    a[0][:-1] = a[0][1:-1]+[tmp[1]]
    #go_down
    for y in range(uy-1, 1, -1):
        a[y][0] = a[y-1][0]
    a[1][0] = tmp[2]
    
    #lower -----------------
    uy= airp[1]
    
    tmp[0] = a[uy][-1]
    tmp[1] = a[r-1][c-1]
    tmp[2] = a[r-1][0]
    
    #go_right
    a[uy][1:]= [0]+a[uy][1:-1]
    
    #go_down
    for y in range(r-1, uy, -1):
        a[y][c-1] = a[y-1][c-1]
    a[uy+1][c-1] = tmp[0]
    
    #go_left
    a[r-1][0:-1] = a[r-1][1:-1]+[tmp[1]]
    
    #go_up
    for y in range(uy+1, r-2):
        a[y][0] = a[y+1][0]
    a[r-2][0]=tmp[2]
    return

for _ in range(t):
    find_mise_spot(a,stack, r,c)
    graph = [[0 for _ in range(c)] for _ in range(r)]
    while stack:
        y, x = stack.pop()
        cnt=0
        for i in range(4):
            ny, nx = y+dy[i], x+dx[i]
            if ny>-1 and ny< r and nx>-1 and nx<c and a[ny][nx]!=-1:
                graph[ny][nx]+=a[y][x]//5
                cnt+=1
        a[y][x]-=(a[y][x]//5)*cnt
    for y in range(r):
        for x in range(c):
            a[y][x] += graph[y][x]
    
    air_purify()

print(sum(x for row in a for x in row if x > 0))