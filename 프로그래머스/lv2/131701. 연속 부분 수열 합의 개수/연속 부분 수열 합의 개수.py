def solution(elements):
    sums=set()
    el_len=len(elements)
    elements=elements[1:el_len]+elements
    for idx in range(el_len):
        for i in range(el_len+idx, len(elements)+1):
            sums.add(sum(elements[idx+el_len-1:i]))
        for i in range(idx+1,el_len-1):
            sums.add(sum(elements[i:el_len+idx]))
    return len(sums)