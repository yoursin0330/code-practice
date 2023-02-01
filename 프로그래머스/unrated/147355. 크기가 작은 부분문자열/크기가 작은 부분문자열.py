def solution(t, p):
    answer = 0
    l=len(p)
    int_p=int(p)
    t_len=len(t) 
    for i in range(t_len-l+1):
        print(t[i:i+l])
        if(int(t[i:i+l])<=int_p):
            answer+=1
    return answer