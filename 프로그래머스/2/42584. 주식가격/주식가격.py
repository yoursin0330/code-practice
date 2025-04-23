def solution(prices):
    answer = [0]*len(prices)
    for i in range(0, len(prices)-1):
        j = i+1
        while j< len(prices):
            if prices[i]>prices[j]:
                answer[i]=j-i
                break
            j+=1
        if j==len(prices):
            answer[i]=len(prices)-i-1
    return answer