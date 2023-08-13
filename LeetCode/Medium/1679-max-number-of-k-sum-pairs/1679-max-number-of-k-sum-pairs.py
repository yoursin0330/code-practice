class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        numlist= sorted(i for i in nums if i < k)
        startIdx, endIdx = 0, len(numlist)-1
        ans=0
        while startIdx<endIdx :
            if numlist[startIdx] + numlist[endIdx] == k:
                ans+=1
                startIdx+=1
                endIdx-=1
            elif numlist[startIdx] + numlist[endIdx] < k:
                startIdx+=1
            else:
                endIdx-=1
        return ans