cal = [31,28,31,30,31,30,31,31,30,31,30,31]
x,y=map(int, input().split())
for m in range(x-1):
    y+=cal[m]
week = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
print(week[y%7])