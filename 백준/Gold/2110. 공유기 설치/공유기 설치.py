import sys
input = sys.stdin.readline

# 최소 인접 거리가 최소가 되게 -> 이분 탐색 사용

n, c = map(int, input().split())

arr=[]

for _ in range(n):
    arr.append(int(input()))
arr.sort() #오름차순 정렬

left = 1
right=arr[-1]-arr[0] #최소 거리를 이분탐색으로 찾는 것

while left<=right:
    mid = (left+right)//2
    curr = arr[0] # 현재 설치하는 좌표
    cnt=1 # 공유기 개수 카운트
    
    for i in range(1, len(arr)):
        if arr[i]>= curr+mid:
            cnt+=1
            curr=arr[i]
    
    if cnt>=c: 
        left=mid+1
    else: right=mid-1
print(right)