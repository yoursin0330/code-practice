#정답코드
import sys
import heapq
input = sys.stdin.readline
INF = sys.maxsize

N = int(input())
M = int(input())
graph = [[] for _ in range(N+1)]
#그래프 생성
for _ in range(M):
  a,b,w = map(int,input().split())
  graph[a].append((w,b))
A,B = map(int,input().split())

q=[(0,A)]
distance = [INF]*(N+1)
distance[A] = 0
#dijkstra
while q:
  m_dis,m_node = heapq.heappop(q)
  if m_dis > distance[m_node]:
    continue

  for t_dis,t_node in graph[m_node]:
    new_dis = m_dis+t_dis
    if new_dis < distance[t_node]:
      distance[t_node] = new_dis
      heapq.heappush(q,(new_dis,t_node))

print(distance[B])