from collections import Counter
def solution(lines):
    answer = 0
    dots=[]
    for line in lines:
        for x in range(line[0], line[1]):
            dots.append(x)
    for c in Counter(dots).values():
        if c>=2: answer+=1
    return answer