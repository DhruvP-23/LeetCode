class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        overallList = nums1 + nums2
        overallList.sort()
        # add the two lists together and sort them

        if len(overallList) % 2 == 0:
            return (overallList[len(overallList)//2 - 1] + overallList[(len(overallList)//2)]) /2
        else:
            return overallList[len(overallList)//2]
