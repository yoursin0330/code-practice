def solution(n, computers):
    visited = [False]*n
    def dfs(node):
        visited[node] = True
        for connect in range(n):
            if computers[node][connect] ==1 and not visited[connect]:
                dfs(connect)
    answer = 0
    
    for i in range(n):
        if not visited[i]:
            answer+=1
            dfs(i)
    return answer