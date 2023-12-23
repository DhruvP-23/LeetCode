class Solution:

    # Find two numbers in a list that add up to a target
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        #making a dictionary to store previously interated values
        numsDict = {}

        # Enumerate is an easier way to have a couter and value to use in a for loop that runs through a iterable obj
        # ex i is counter ( index )
        # n is the value of nums[i]
        for i, n in enumerate(nums):
            #checks if (target - n) ( the number you need to add to n to get target ) is in the dictionary
            if target - n in numsDict:
                return [numsDict[target - n], i]
            else:
                numsDict[n] = i
