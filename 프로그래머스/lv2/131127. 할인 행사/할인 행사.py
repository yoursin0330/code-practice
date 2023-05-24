def solution(want, number, discount):
    answer = 0
    for day in range(len(discount)-9):
        isOk=True
        for i in range(len(want)):
            if not discount[day:day+10].count(want[i])==number[i]:
                isOk=False
                break
        if isOk: answer+=1
    return answer