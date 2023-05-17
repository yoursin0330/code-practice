import re
def solution(new_id):
    new_id= new_id.lower() #1
    new_id=re.sub(r'[^a-z0-9\-_\.]','',new_id) #2
    new_id=re.sub(r'[.]{2,}','.',new_id) #3
    new_id=new_id.strip('.') #4
    if new_id=="": new_id="a" #5
    new_id=new_id[:15].strip('.') #6
    if len(new_id)<=2: #7
        new_id+=(new_id[-1]*(3-len(new_id)))
    return new_id