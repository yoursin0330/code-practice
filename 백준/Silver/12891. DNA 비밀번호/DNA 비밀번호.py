import sys
input = sys.stdin.readline
s, p = map(int, input().split()) #문자열 길이, 부분문자열 길이
arr = list(input().rstrip())
check = list(map(int, input().split()))
chars = {'A':0, 'C':1, 'G':2, 'T':3}

ans=0

for x in arr[:p]:
    check[chars[x]]-=1
    
if max(check)<=0 : ans+=1

for i in range(s-p):
    check[chars[arr[i]]]+=1
    check[chars[arr[i+p]]]-=1
    if max(check)<=0 : ans+=1
print(ans)