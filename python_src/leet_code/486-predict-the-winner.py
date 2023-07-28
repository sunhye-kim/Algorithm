class Solution(object):
    def dp(self, nums, i, j):
        if i > j:
            return 0
        return max(nums[i] - self.dp(nums, i + 1, j), nums[j] - self.dp(nums, i, j - 1))

    def PredictTheWinner(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        return self.dp(nums, 0, len(nums) - 1) >= 0


if __name__ == "__main__":
    test_cases = [[1, 5, 2], [1, 5, 233, 7]]
    for test_case in test_cases:
        result = Solution().PredictTheWinner(test_case)
        print(result)
