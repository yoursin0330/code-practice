fibcnt=0
n =int(input())
def fib(n):
    if n<3:
        global fibcnt
        fibcnt+=1
        return
    else: 
        fib(n-1)
        fib(n-2)
fib(n)
print(f'{fibcnt} {n-2}')