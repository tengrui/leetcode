import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        sorted_index = sorted(range(len(nums)), key = lambda i: nums[i])
        i = 0
        j = len(nums) - 1
        while i < j:
            sum_value = nums[sorted_index[i]] + nums[sorted_index[j]]
            if sum_value > target:
                j -= 1
            elif sum_value < target:
                i += 1
            else:
                return [sorted_index[i], sorted_index[j]]
        return []
