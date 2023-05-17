import re
def solution(my_string):
    return sum([int(x) for x in (re.split(r'[a-zA-Z]',my_string)) if x!=''])