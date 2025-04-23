def solution(s):
    stacked=0
    for x in s:
        if x == '(':
            stacked+=1
        else: # )
            if stacked>0:
                stacked-=1
            else:
                return False
    if stacked==0: return True
    return False