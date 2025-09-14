import sys
input = sys.stdin.readline
arr = []
for _ in range(3):
    arr.append(int(input()))
arr.sort()
if sum(arr)!=180: print("Error")
elif arr[0]==arr[2]: print("Equilateral")
elif arr[0]<arr[1]<arr[2]: print("Scalene")
else: print("Isosceles")