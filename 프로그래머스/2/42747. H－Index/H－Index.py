def solution(citations):
    for h in range(len(citations)+1):
        if len(list(filter(lambda x : x>=h, citations)))<h: return h-1
    return len(citations)