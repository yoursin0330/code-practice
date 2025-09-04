maxval=-1
y,x=0,0
for i in range(9):
	arr = list(map(int, input().split()))
	for j in range(9):
		if maxval<arr[j]:
			maxval=arr[j]
			y,x = i,j
print(maxval)
print(f'{y+1} {x+1}')