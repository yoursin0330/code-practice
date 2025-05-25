from __future__ import annotations
import sys
input= sys.stdin.readline
sys.setrecursionlimit(100000)
        
def merge(a,b): #a가 포함되어 있는 집합과 b가 포함된 집합 합침
    a=find(a)
    b=find(b) #루트 노드
    if a<b :parent[b]=a #숫자가 작은 쪽을 부모로 하도록
    else: parent[a]=b 
def find(x:int)->int: #a와 b가 같은 집합인지 확인
    if x!=parent[x]:
        parent[x]=find(parent[x])
    return parent[x]
        

n, m=map(int, input().split())
parent=[i for i in range(n+1)] #0~n 
for _ in range(m):
    act,a,b=map(int,input().split())
    if act==0:
        merge(a,b)
    else: 
        if find(a)==find(b):
            print("YES")
        else:
            print("NO")
  