for _ in range(3):
    zero=0
    for x in list(map(int, input().split())):
        if x==0: zero+=1
    if zero==1: print("A")
    elif zero==2: print("B")
    elif zero==3: print("C")
    elif zero==4: print("D")
    else: print("E")