answer = 51
def solution(begin, target, words):
    global answer
    visited = [False for _ in range(len(words))]
    for i in range(len(words)):
        if onechanged(begin, words[i]):
            dfs(i, target, words, visited, 1)
    return answer if answer<51 else 0
def dfs(idx, target, words, visited, cnt):
    if target == words[idx]: 
        global answer
        answer = min(answer, cnt)
        return
    visited[idx]=True
    for i in range(len(words)):
        if not visited[i] and onechanged(words[idx], words[i]):
            dfs(i, target, words, visited, cnt+1)
    visited[idx]=False
        
def onechanged(w1, w2): # 한 글자 차이인지 판별
    cnt=0
    for i in range(len(w1)): cnt+= 1 if not w1[i]==w2[i] else 0
    return True if cnt==1 else False
    