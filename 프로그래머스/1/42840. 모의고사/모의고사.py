def solution(answers):
    answer = []
    supo_cnt = [0,0,0]
    supo_ans = [0,0,0]
    supo2 = [2, 1, 2, 3, 2, 4, 2, 5]
    supo3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    for i in range(0,len(answers)):
        supo_ans[0] = i%5+1;
        supo_ans[1] = supo2[i%8]
        supo_ans[2] = supo3[i%10]
        for idx in range(3):
            if answers[i] == supo_ans[idx]: supo_cnt[idx]+=1
        
    maxcnt = max(supo_cnt)
    for i in range(3):
        if maxcnt == supo_cnt[i]: answer.append(i+1)
    return answer