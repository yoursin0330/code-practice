import sys
from collections import defaultdict
input=sys.stdin.readline
count = defaultdict(int)

arr = input().rstrip().lower()
for x in arr:
    count[x]+=1

max_cnt = max(count.values())

maxcntkeys = [x for x, cnt in count.items() if cnt == max_cnt]

if len(maxcntkeys)>1: print("?")
else : print(maxcntkeys[0].upper())