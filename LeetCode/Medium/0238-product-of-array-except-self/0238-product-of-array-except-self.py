import numpy as np
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        numarr = np.array(nums)
        ans=list()
        for i in range(0, len(nums)):
            ans.append(np.multiply.reduce(np.delete(numarr,i)))
        return ans