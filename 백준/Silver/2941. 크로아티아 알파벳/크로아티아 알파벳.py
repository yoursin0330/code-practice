import sys
input = sys.stdin.readline

word = input().rstrip()

c_alpha = ["dz=","c=","c-","d-","lj","nj","s=","z="]

for c in c_alpha:
    word = word.replace(c, "0")
print(len(word))