import sys

input = sys.stdin.readline
write = sys.stdout.write
n = int(input())
deque = list()
for _ in range(n):
    inst = list(input().split())
    if inst[0]== "push_front":
        deque.insert(0,inst[1])
    elif inst[0]=="push_back":
        deque.append(inst[1])
    elif inst[0]=="pop_front":
        if len(deque)>0: write(str(deque.pop(0))+"\n")
        else: write(str(-1)+"\n")
    elif inst[0]=="pop_back":
        if len(deque)>0: write(str(deque.pop(-1))+"\n")
        else: write("-1\n")
    elif inst[0]=="size": write(str(len(deque))+"\n")
    elif inst[0]=="empty": write("1\n" if len(deque)==0 else "0\n")
    elif inst[0]=="front": write(str(deque[0])+"\n" if len(deque)>0 else "-1\n")
    else : write(str(deque[-1])+"\n" if len(deque)>0 else "-1\n")