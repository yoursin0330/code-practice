import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
arr.sort()

def find(arr, n):
    res =[1000000000,1000000000,1000000000]
    for k in range(n-2):
        if arr[k]>0 and k>0: return res
        i = k+1
        j = n-1
        while i<j:
            if abs(arr[k]+arr[i]+arr[j]) < abs(sum(res)):
                res = [arr[k],arr[i],arr[j]]
            if arr[k]+arr[i]+arr[j] >0:
                j-=1
            elif arr[k]+arr[i]+arr[j] <0:
                i+=1
            else: 
                return res
    return res
print(*find(arr, n))