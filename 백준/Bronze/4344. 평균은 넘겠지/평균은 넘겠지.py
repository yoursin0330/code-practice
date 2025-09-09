c = int(input())
for _ in range(c):
    arr = list(map(int, input().split()))
    avg = sum(arr[1:])/arr[0]
    print(f'{round(100*sum(map(lambda x: x>avg, arr[1:]))/arr[0],3)}%')