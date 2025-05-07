import sys
input= sys.stdin.readline
sum=0
cnt=0

degdict = {
    'A+':4.5,
    'A0':	4.0,
    'B+':	3.5,
    'B0':	3.0,
    'C+':	2.5,
    'C0':	2.0,
    'D+':	1.5,
    'D0':	1.0,
    'F':	0.0
}

for _ in range(20):
    arr = list(input().split())
    if arr[2]=='P': continue
    sum+=degdict[arr[2]]*float(arr[1])
    cnt+=float(arr[1])
    
print(sum/cnt)