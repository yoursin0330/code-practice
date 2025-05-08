import sys
input = sys.stdin.readline
t=int(input())
for _ in range(t):
    n=int(input())
    phone = []
    for _ in range(n):
        phone.append(input().rstrip().replace(" ",""))
    phone.sort()
    samecheck=False
    for i in range(n-1):
        if phone[i+1].startswith(phone[i]): 
            samecheck=True
            break
    print("NO" if samecheck else "YES")