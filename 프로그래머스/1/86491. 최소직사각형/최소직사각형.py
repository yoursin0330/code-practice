def solution(sizes):
    sizes = [sorted(size, reverse=True) for size in sizes]
    return max(x for x, _ in sizes)*max(y for _, y in sizes)