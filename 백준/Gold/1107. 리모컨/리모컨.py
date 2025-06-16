import sys
input = sys.stdin.readline

N = int(input())  # 목표 채널
M = int(input())  # 고장 버튼 개수

broken = set()
if M > 0:
    broken = set(input().split())

def is_possible(num):
    for digit in str(num):
        if digit in broken:
            return False
    return True

# 초기값: 100번에서 + / - 로만 이동하는 경우
min_press = abs(N - 100)

# 0부터 999999까지 확인 (최대 6자리 수)
for i in range(1000000):
    if is_possible(i):
        press = len(str(i)) + abs(i - N)
        min_press = min(min_press, press)

print(min_press)