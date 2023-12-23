class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 0
        # using len(nums)-1 so i can compare i and the next var without going out of the range of the list
        for i in range(len(nums)-1):
            l = i+1
            if nums[i] != nums[l]:
                #j is where the new number will be placed
                j += 1
                nums[j] = nums[l]
        return j +1
