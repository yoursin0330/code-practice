import sys
input = sys.stdin.readline

n = int(input())
foodarr = []

def printRoute(foodroute, startdepth):
    for x in range(startdepth,foodroute[1]):
        print("--"*x , end="")
        print(foodroute[0][x])

for _ in range(n):
    info = input().rstrip().split(" ")
    foodarr.append([' '.join(info[1:]), int(info[0])])
foodarr.sort(key=lambda x:x[0])
foodarr[0][0] = foodarr[0][0].split(" ")
printRoute(foodarr[0], 0)
for x in range(1,n):
    foodarr[x][0] = foodarr[x][0].split(" ")
    if foodarr[x-1][0][0] != foodarr[x][0][0]: printRoute(foodarr[x], 0)
    else :
        for start in range(min(foodarr[x-1][1], foodarr[x][1]),-1,-1):
            if foodarr[x-1][0][:start] == foodarr[x][0][:start]:
                printRoute(foodarr[x], start)
                break