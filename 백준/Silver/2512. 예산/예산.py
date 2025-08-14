n = int(input())
budget = list(map(int, input().split()))
total = int(input())
budget.sort()

left, right = 0, budget[-1]
ans=0
while left<=right:
    mid = (left+right)//2
    sum = 0
    for b in budget:
        sum+=min(b, mid)
    if sum<=total:
        ans=mid
        left=mid+1
    else: right=mid-1
print(ans)