def solution(citations):
    h=max(citations)
    while(h>=0):
        upper=0
        for k in citations: 
            if k>=h : upper+=1
        if upper>=h : return h;
        h-=1;
    return 0;