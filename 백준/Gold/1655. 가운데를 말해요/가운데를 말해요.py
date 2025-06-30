import heapq

smaller = [] # 중간값 이하의 값들 -> - 붙여서 저장
bigger = [] # 중간값 초과의 값들

def insert(num):
    if not smaller or num<= -smaller[0]:
        heapq.heappush(smaller, -num)
    else:
        heapq.heappush(bigger, num)
        
    # smaller이 항상 더 많거나 같아야 함
    if len(smaller) > len(bigger)+1:
        heapq.heappush(bigger, -heapq.heappop(smaller))
    elif len(bigger) > len(smaller):
        heapq.heappush(smaller, -heapq.heappop(bigger))
    
def get_median():
    return -smaller[0] # 작은 값들 중 가장 큰 값

n = int(input())
ans=[]
for _ in range(n):
    insert(int(input()))
    ans.append(get_median())

for a in ans: print(a)