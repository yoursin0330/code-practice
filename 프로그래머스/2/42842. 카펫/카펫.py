import math
def solution(brown, yellow):
    answer = []
    # 가로 y, 세로 x라고 할 때 / 가로 >= 세로
    # brown = 2*y + 2*x -4
    # yellow = (x-2)*(y-2) = x*y -2*x -2*y +4
    xy = brown+yellow
    for dx in range(3, int(math.sqrt(xy))+1):
        if xy%dx==0:
            dy = xy//dx
            if (dx-2)*(dy-2) == yellow:
                answer.append(dy)
                answer.append(dx)
                break
    return answer