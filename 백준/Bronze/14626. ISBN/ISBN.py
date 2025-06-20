import sys
input = sys.stdin.readline

num = list(input().rstrip())
div=3
sum=0
for i in range(13):
  if num[i]=='*':
    if i%2==0 : div=1
  else: sum+= int(num[i])*(1 if i%2==0 else 3)

lastnum = (10 - (sum)%10)%10

for x in range(0,10):
  if (div*x)%10 == lastnum: print(x)