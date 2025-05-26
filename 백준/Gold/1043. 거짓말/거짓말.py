import sys
from collections import defaultdict
input=sys.stdin.readline
n, m  = map(int, input().split())

knows = set(list(map(int, input().split()))[1:])
ppl_party = defaultdict(list) # ppl : party
party_ppl = defaultdict(list) # party : ppl

def pop_ppl(party):
    for p in party:
        ppl = party_ppl.pop(p, None)
        if ppl: pop_party(ppl)
        
def pop_party(ppl):
    for p in ppl:
        knows.add(p)
        party = ppl_party.pop(p, None)
        if party: pop_ppl(party)

for i in range(m):
    ppl = set(list(map(int, input().split()))[1:])
    if ppl&knows:
        pop_party(ppl)
        for p in ppl:
            knows.add(p)
    else:
        for p in ppl:
            ppl_party[p].append(i)
            party_ppl[i].append(p)
print(len(party_ppl))