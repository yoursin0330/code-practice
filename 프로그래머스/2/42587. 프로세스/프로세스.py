def solution(priorities, location):
    answer = 0
    check = [False]*len(priorities)
    check[location]=True
    idx=0
    while priorities:
        if max(priorities) <= priorities[idx]:
            priorities.pop(idx)
            answer+=1
            if check[idx]: break
            check.pop(idx)
        else: idx+=1
        idx=idx%len(priorities)
    return answer