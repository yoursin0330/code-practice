answer = 0
def solution(k, dungeons):
    visited = [False]*len(dungeons)
    for idx in range(len(dungeons)):
        if(dungeons[idx][0]<=k):
            explore(k, idx, dungeons, visited, 0)
    return answer

def explore(left, now, dungeons, visited, cnt):
    visited[now]=True
    cnt+=1
    nextVisit = False
    left-=dungeons[now][1]
    for i in range(len(dungeons)):
        if i!= now and not visited[i] and dungeons[i][0] <= left:
            nextVisit = True
            explore(left, i, dungeons, visited, cnt)
            visited[i] = False
    if not nextVisit:
        global answer
        answer = max(cnt, answer)
        return
    visited[now]=False
        