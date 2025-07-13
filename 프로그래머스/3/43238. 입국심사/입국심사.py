def solution(n, times):
    answer=0
    
    left=1
    right = max(times)*n # 가장 최장 시간
    
    while left<=right: # 이분탐색으로 최소시간 찾기
        mid = (left+right)//2
        ppl=0
        
        for time in times:
            ppl+=mid//time
            
            if ppl>=n: break
        if ppl>=n:
            right=mid-1
        else: left = mid+1
    return left