class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        search_map = {}
        for i, num in enumerate(nums):
            expected_value = target - num
            if expected_value in search_map:
                return [i, search_map[expected_value]]
            else:
                search_map[num] = i
        return []
