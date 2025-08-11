import sys, heapq
input = sys.stdin.readline

t= int(input())

for _ in range(t):
    k = int(input())
    minheap = []
    maxheap = []
    chk = set()
  
    for i in range(k):
        cal, num = input().split()
        num = int(num)
        if cal == "I":
            heapq.heappush(minheap, (num, i))
            heapq.heappush(maxheap, (-num,i))
            chk.add(i)
        else:
            if num == -1:
                v = "N"
                while minheap:
                    v,k = heapq.heappop(minheap)
                    if k in chk: break
                    else: v = "N"
                if v!="N": chk.remove(k)
            else:
                v = "N"
                while maxheap:
                    v,k = heapq.heappop(maxheap)
                    v*=-1
                    if k in chk: break
                    else: v = "N"
                if v!="N": chk.remove(k)
    minv = "N"
    while minheap:
        minv,k = heapq.heappop(minheap)
        if k in chk: break
        else: minv = "N"
    if minv!="N": chk.remove(k)
    maxv="N"
    while maxheap:
        maxv,k = heapq.heappop(maxheap)
        maxv*=-1
        if k in chk: break
        else: maxv = "N"
    if minv=="N": print("EMPTY")
    else:
      if maxv=="N": maxv = minv
      print(maxv, minv)