import math
from collections import deque

numset = set()
answer = 0
def solution(numbers):
    digits = list(numbers)
    visited = [False for _ in range(len(digits))]
     #나온 숫자
    for i in range(len(digits)):
        addnum(i,digits[i],digits,visited)
    global answer
    return answer
    
def addnum(idx, num, digits, visited):
    visited[idx] = True
    global numset
    if int(num) not in numset:
        if checksosu(int(num)):
            global answer
            answer+=1
        numset.add(int(num))
    for next in range(len(digits)):
        if not visited[next]:
            addnum(next, str(num)+digits[next], digits, visited)
            visited[next]=False
    visited[idx] = False # backtracking
    return
    
def checksosu(num):
    if num<=1: return False
    for i in range(2, int(math.sqrt(num))+1):
        if num%i==0: return False
    return True
    