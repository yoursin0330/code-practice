def solution(array, commands):
    answer = []
    for start, end, k in commands:
        answer.append(sorted(array[start-1:end])[k-1])
    return answer