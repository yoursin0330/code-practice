from collections import defaultdict

def solution(participant, completion):
    answer = ''
    part_cnt = defaultdict(int)
    for ppl in participant:
        part_cnt[ppl]+=1
    for ppl in completion:
        if part_cnt[ppl]==1:
            part_cnt.pop(ppl)
        else : part_cnt[ppl]-=1
    for ppl in part_cnt.keys():
        answer = ppl
    return answer