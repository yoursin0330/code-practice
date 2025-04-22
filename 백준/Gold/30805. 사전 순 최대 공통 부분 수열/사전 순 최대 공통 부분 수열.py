import sys
input = sys.stdin.readline
n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))
arr=[]
while a and b:
    common = set(a) & set(b)
    if not common:
        break
    else:
        start = max(common)
        arr.append(start)
    a = a[a.index(start)+1::]
    b = b[b.index(start)+1::]

print(len(arr))
for x in arr: print(x, end=" ")