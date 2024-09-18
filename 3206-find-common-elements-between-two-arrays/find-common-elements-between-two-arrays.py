class Solution(object):
    def findIntersectionValues(self, nums1, nums2):
        l=[]
        c=0
        for num in nums1:
            if num in nums2:
                c=c+1
        l.append(c)
        c=0
        for num in nums2:
            if num in nums1:
                c=c+1
        l.append(c)
        return l
        