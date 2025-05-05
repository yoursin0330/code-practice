import sys
input = sys.stdin.readline

arr = input().rstrip()
bomb = input().rstrip()
stack = []
bomb_len = len(bomb)

for ch in arr:
    stack.append(ch)
    # bomb과 끝부분이 일치하는지 확인
    if ''.join(stack[-bomb_len:]) == bomb:
        del stack[-bomb_len:]

if stack:
    print(''.join(stack))
else:
    print('FRULA')
