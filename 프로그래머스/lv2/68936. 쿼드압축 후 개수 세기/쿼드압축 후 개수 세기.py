def solution(arr):
    answer=[0,0]
    recur(arr, len(arr), 0,0, answer)
    return answer

def recur(arr, size, startY, startX, answer):
    if size==1:
        answer[arr[startY][startX]]+=1
        return
    for i in range(startY, startY + size):
        for j in range(startX, startX+size):
            if arr[i][j] != arr[startY][startX]:
                recur(arr, size//2, startY, startX, answer)
                recur(arr, size//2, startY+size//2, startX, answer)
                recur(arr, size//2, startY, startX+size//2, answer)
                recur(arr, size//2, startY+size//2, startX+size//2, answer)
                return
    answer[arr[startY][startX]]+=1
    return
