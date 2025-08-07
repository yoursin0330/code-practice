import sys
input = sys.stdin.readline
e,s,m = map(int, input().split()) # 지구 태양 달
year=s
while True:
    if (year-1)%15+1 == e and (year-1)%19+1 == m: break
    year +=28
print(year)