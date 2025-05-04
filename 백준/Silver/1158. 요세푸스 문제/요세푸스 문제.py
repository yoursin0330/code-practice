import sys
input = sys.stdin.readline
n,k = map(int, input().split())
arr = [i for i in range(1, n+1)]
idx=0
ppl=[]
while len(arr)>0:
    idx =(idx+k-1)%len(arr)
    ppl.append(str(arr.pop(idx)))
print("<", end="")
print(", ".join(ppl), end="")
print(">",end="")