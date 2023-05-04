def solution(N, stages):
    failures=dict()
    for i in range(1,N+2):
        failures[i]=0
    for s in stages:
        failures[s]+=1
    sum=failures.pop(N+1)
    for idx, ppl in sorted(failures.items(),reverse=True):
        sum+=ppl
        if sum==0: failures[idx]=0
        else: failures[idx]/=sum
    result=[]
    sorted_dict=sorted(failures.items(), key=lambda item: (item[1], -item[0]), reverse=True)

    for a, b in sorted_dict:
        result.append(a)
    return result
