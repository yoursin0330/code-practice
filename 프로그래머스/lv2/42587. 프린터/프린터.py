from collections import deque
def solution(priorities, location):
    answer = 0;
    queue=deque();
    for x in priorities:
        queue.append(x);
    while queue:
        first=queue.popleft();
        if not queue or first>=max(queue):
            answer+=1
            if location==0:
                return answer;
        else:
            queue.append(first);
        location-=1
        if location<0: location=len(queue)-1
    return answer