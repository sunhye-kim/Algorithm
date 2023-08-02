from itertools import permutations


class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        return list(permutations(nums))


if __name__ == "__main__":
    test_cases = [[1, 2, 3], [0, 1], [1]]
    for test_case in test_cases:
        result = Solution().permute(test_case)
        print(result)
