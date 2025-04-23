def solution(nums):
    # 최대 종류 -> n/2 개
    return min(len(nums)/2, len(set(nums)))