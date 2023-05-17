def solution(babbling):
    answer = 0
    for babb in babbling:
        babb=babb.replace('aya',' ',1)
        babb=babb.replace('ye',' ',1)
        babb=babb.replace('woo',' ',1)
        babb=babb.replace('ma',' ',1)
        if babb.replace(" ","")=='': answer+=1
        print(babb)
    return answer