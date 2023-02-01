def solution(a, b):
    daysCount=b;
    day=["THU","FRI","SAT","SUN","MON","TUE","WED"]
    month=[31,29,31,30,31,30,31,31,30,31,30,31]
    for i in range(0,a-1):
        daysCount+=month[i];
    return day[daysCount%7];