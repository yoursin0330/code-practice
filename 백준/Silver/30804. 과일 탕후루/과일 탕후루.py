from collections import defaultdict
import sys
input = sys.stdin.readline
n = int(input())
fruits = list(map(int, input().split()))
packed = []
num, cnt = fruits[0],1
for i in range(1,n):
    if fruits[i]==fruits[i-1]:
        cnt+=1
    else:
        packed.append([num,cnt])
        num=fruits[i]
        cnt=1
packed.append([num,cnt])
n_blocks = len(packed)

# 윈도우 포인터와 상태 초기화
l = 0
r = 0
type_count = defaultdict(int)
type_count[packed[0][0]] = 1
distinct = 1                 # 윈도우 안 과일 종류 개수
length = packed[0][1]        # 윈도우 안 전체 과일 개수
ans = length

# 슬라이딩 윈도우
while r + 1 < n_blocks:
    next_fruit = packed[r+1][0]
    # 확장 가능 조건: 종류가 1개 이하이거나, 이미 있는 과일을 추가할 때
    if distinct < 2 or type_count[next_fruit] > 0:
        r += 1
        type_count[next_fruit] += 1
        if type_count[next_fruit] == 1:
            distinct += 1
        length += packed[r][1]
        ans = max(ans, length)
    else:
        # 종류가 2개 이미 있고, 새로운 과일을 추가해야 할 때는 수축
        left_fruit = packed[l][0]
        type_count[left_fruit] -= 1
        if type_count[left_fruit] == 0:
            distinct -= 1
        length -= packed[l][1]
        l += 1

print(ans)
