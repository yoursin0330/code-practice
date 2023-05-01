def solution(n, lost, reserve):
    answer = n
    a = list(set(reserve) - set(lost))
    b= list(set(lost) - set(reserve))
    reserve =a
    lost = b
    # 겹치는 것 제거하기
    lost.sort()

    for x in lost:
        if x-1 in reserve:
            reserve.remove(x-1)
        elif x+1 in reserve:
            reserve.remove(x+1)
        else:
            answer-=1

    return answer