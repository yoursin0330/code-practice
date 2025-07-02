import sys
from collections import deque
input = sys.stdin.readline
s = input().rstrip()
slen = len(s)

t = deque(input().rstrip())
flag = True # 뒤에서부터

while len(t)>slen:
    if flag:
        x= t.pop()
    else:
        x = t.popleft()
    if x=='B': flag = not flag

ans =1
if flag:
    for i in range(slen):
        if s[i]!=t.popleft():
            ans=0
            break
else:
    for i in range(slen):
        if s[i]!=t.pop():
            ans=0
            break
print(ans)