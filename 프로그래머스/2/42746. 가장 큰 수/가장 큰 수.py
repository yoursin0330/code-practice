def solution(numbers):
    answer = ''
    numtostr = list(map(str, numbers))
    numtostr.sort(key=lambda x : x*3 , reverse=True)
    
    return str(int(''.join(numtostr)))