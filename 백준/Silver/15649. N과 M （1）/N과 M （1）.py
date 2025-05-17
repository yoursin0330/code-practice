import sys
input = sys.stdin.readline

n, m = map(int, input().split())
check = [False] * (n+1)
num = []

def dfs(left):
    # 남은 개수가 0이면 지금까지 쌓은 조합/순열을 출력
    if left == 0:
        print(*num)
        return

    for i in range(1, n+1):
        if not check[i]:
            check[i] = True      # i를 선택했으니 표시
            num.append(i)        # 경로에 추가

            dfs(left - 1)        # 재귀 호출

            # 재귀가 끝나고 돌아오면 방금 선택(i)을 되돌려야 함
            num.pop()
            check[i] = False

# 초기 호출: m개를 뽑을 때
dfs(m)