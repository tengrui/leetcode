import unittest
from solution import Solution

class TestSolution(unittest.TestCase):
    def test_two_sum(self):
        nums = [2, 7, 11, 15]
        target = 9
        s = Solution
        result = s.twoSum(nums, target)
        result.sort()
        self.assertEqual(result, [0, 1])
    def test_two_sum_2(self):
        nums = [2, 7, 11, 15]
        target = 13
        s = Solution
        result = s.twoSum(nums, target)
        result.sort()
        self.assertEqual(result, [0, 2])

if __name__ == '__main__':
    unittest.main()