import sys
input = sys.stdin.readline

n = int(input())

# 국어 감소, 영어 증가, 수학 감소, 이름 증가

arr = []
for _ in range(n):
    name, kor, eng, math= input().split()
    arr.append([int(kor), int(eng), int(math), name])

arr.sort(key=lambda x:(-x[0], x[1],-x[2], x[3]))

for x in arr:
    print(x[3])