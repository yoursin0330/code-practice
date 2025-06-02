import heapq,sys
heap=[]
num=int(sys.stdin.readline())
#입력받을 것 개수

for _ in range(num):
    n=int(sys.stdin.readline())
    if not n:
        if heap:
            print(heapq.heappop(heap))
        else: print(0) 
    else:
        heapq.heappush(heap,n)