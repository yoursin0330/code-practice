import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
queue = deque()
ans=[]
for _ in range(n):
    arr = input().split()
    if arr[0]=="push":
        queue.appendleft(arr[1])
    elif arr[0]=="pop":
        ans.append(-1 if not queue else queue.pop())
    elif arr[0]=="size":
        ans.append(len(queue))
    elif arr[0]=="empty":
        ans.append(0 if queue else 1)
    elif arr[0]=="front":
        ans.append(-1 if not queue else queue[-1])
    else:
        ans.append(-1 if not queue else queue[0])

for x in ans: print(x)