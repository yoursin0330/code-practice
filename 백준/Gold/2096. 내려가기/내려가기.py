import sys
input = sys.stdin.readline
n = int(input()) # lines
nums = list(map(int, input().split()))
prev_min = nums[:]
prev_max = nums[:]

for i in range(1,n):
    nums = list(map(int, input().split()))
    # min
    curr_min = [
        min(prev_min[0:2])+nums[0],
        min(prev_min[::])+nums[1],
        min(prev_min[1:3])+nums[2]
    ]
    #max
    curr_max= [
        max(prev_max[0:2])+nums[0],
        max(prev_max[::])+nums[1],
        max(prev_max[1:3])+nums[2]
    ]
    prev_min = curr_min
    prev_max = curr_max
print(f'{max(prev_max[::])} {min(prev_min[::])}')