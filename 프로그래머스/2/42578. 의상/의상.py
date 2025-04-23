from collections import defaultdict
def solution(clothes):
    closet = defaultdict(int)
    for clothing, wear in clothes:
        closet[wear]+=1
    answer = 1
    for x in closet.values(): answer*=(x+1)
    return answer-1