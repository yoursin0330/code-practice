import sys
input = sys.stdin.readline

max = -1e9
min = 1e9

n = int(input())
nums = list(map(int, input().split()))
func = list(map(int, input().split()))

def dfs(num, idx, n, nums, func):
    if idx == n:
        global max, min
        if max<num: max=num
        if min>num: min=num
        return
    else:
        # 진행
        for i in range(4):
            if func[i]>0:
                func[i]-=1
                if i==0: dfs(num+nums[idx], idx+1, n, nums, func)
                elif i==1: dfs(num-nums[idx], idx+1, n, nums, func)
                elif i==2: dfs(num*nums[idx], idx+1, n, nums, func)
                else: dfs(int(num/nums[idx]), idx+1, n, nums, func)
                func[i]+=1
    
dfs(nums[0], 1, n, nums, func)
print( int(max), int(min), sep="\n")