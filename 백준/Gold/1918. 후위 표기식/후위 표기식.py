import sys
from collections import deque
arr = sys.stdin.readline().rstrip()
stack =[]
answer=""

prior = {
        '+' : 1, '-':1,
        '*' : 2, '/': 2
        }

for x in arr:
    if x.isalpha(): answer+=x
    elif x in "+-*/":
        while stack and stack[-1] !='(' and prior[stack[-1]] >= prior[x]:
            answer+=stack.pop()
        stack.append(x)
    elif x=='(':
        stack.append(x)
    elif x==')':
        while stack and stack[-1] != '(':
            answer+=stack.pop()
        stack.pop()
        
while stack:
    answer+=stack.pop()
    

print(answer)