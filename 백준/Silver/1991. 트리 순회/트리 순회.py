import sys
input=sys.stdin.readline

tree = {}

def preorder(parent):
    print(parent,end="")
    for child in tree[parent]:
        if child != ".":
            preorder(child)
    return
def inorder(parent):
    children = tree[parent]
    if children[0] !=".":
        inorder(children[0])
    print(parent,end="")
    if children[1] !=".":
        inorder(children[1])
    return
    
def postorder(parent):
    for child in tree[parent]:
        if child != ".":
            postorder(child)
    print(parent, end="")
    return

n= int(input())

for _ in range(n):
    parent, left, right = input().split()
    tree[parent] = [left, right] # 없는 건 .

rootnode = "A"

preorder(rootnode)
print()
inorder(rootnode)
print()
postorder(rootnode)