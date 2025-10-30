from collections import defaultdict
def solution(topping):
    answer = 0
    left = defaultdict(int)
    right = defaultdict(int)
    for t in topping:
        right[t]+=1
    for x in topping:
        left[x]+=1
        if right[x]==1: right.pop(x)
        else: right[x]-=1
        if len(left)==len(right): answer+=1
    return answer