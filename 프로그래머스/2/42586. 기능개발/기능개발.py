import math
def solution(progresses, speeds):
    end=0
    answer=[]
    while(end<len(progresses)):
        daily_end = 1
        days = math.ceil((100-progresses[end])/speeds[end])
        end+=1
        while(end<len(progresses)):
            if progresses[end]+days*speeds[end]<100 : # 끝내기 실패
                break
            else: daily_end+=1
            end+=1
        answer.append(daily_end)
    return answer