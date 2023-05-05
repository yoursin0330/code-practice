def solution(board, moves):
    answer = 0
    max_depth=len(board)
    bucket=[]
    for move in moves:
        depth=0
        while depth<max_depth:
            if board[depth][move-1]>0:
                new_doll = board[depth][move-1]
                board[depth][move-1]=0
                if len(bucket)>0 and bucket[-1] == new_doll:
                    bucket.pop(-1)
                    answer+=2
                else:
                    bucket.append(new_doll)
                break
            else: depth+=1
    return answer