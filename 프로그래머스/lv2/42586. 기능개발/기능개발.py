import math
def solution(progresses, speeds):
    answer = [];
    idx=0
    while(idx<len(progresses)):
        days=math.ceil((100-progresses[idx])/speeds[idx])
        last=idx+1
        while(last<len(progresses)):
            if days*speeds[last]+progresses[last]>=100: last+=1
            else: break
        answer.append(last-idx);
        idx=last
    return answer