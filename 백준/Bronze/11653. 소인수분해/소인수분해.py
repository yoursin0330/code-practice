n = int(input())
div=2
while n>1:
	while n%div>0: div+=1
	print(div)
	n/=div