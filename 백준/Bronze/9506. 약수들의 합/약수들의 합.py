import sys
input = sys.stdin.readline
while True:
    n = int(input())
    if n==-1: break
    arr= []
    s = 0
    for i in range(1,n):
        if n%i==0: 
            arr.append(str(i))
            s+=i
        if s>n: break
    if n!=s:
        print(f'{n} is NOT perfect.')
    else:
        print(f'{n} = {" + ".join(arr)}')