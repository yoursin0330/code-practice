import collections
class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        dictArr = collections.Counter(arr)
        if len(dictArr) != len(set(dictArr.values())):
            return False
        else: return True