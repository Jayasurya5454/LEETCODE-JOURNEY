class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        f =sum(nums)
        l=sum(set(nums))
        p=[]
        p.append(f-l)
        n=len(nums)
        p.append(((n*(n+1))//2) - l)
        return p
        