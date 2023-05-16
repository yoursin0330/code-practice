import re

def solution(order):
    p = re.compile('[369]')
    return len(p.findall(str(order)))