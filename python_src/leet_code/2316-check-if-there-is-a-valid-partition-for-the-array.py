from typing import List


class Solution:
    def validPartition(self, nums: List[int]) -> bool:
        nums_len = len(nums)
        dp = [False] * 3
        dp[0] = True

        for i in range(2, nums_len + 1):
            ans = False

            if nums[i - 1] == nums[i - 2]:
                ans = ans or dp[(i - 2) % 3]
            if i >= 3 and nums[i - 1] == nums[i - 2] == nums[i - 3]:
                ans = ans or dp[(i - 3) % 3]
            if i >= 3 and nums[i - 1] == nums[i - 2] + 1 == nums[i - 3] + 2:
                ans = ans or dp[(i - 3) % 3]

            dp[i % 3] = ans

        return dp[nums_len % 3]


if __name__ == "__main__":
    test_cases = [[4, 4, 4, 5, 6], [1, 1, 1, 2]]
    for test_case in test_cases:
        Solution().validPartition(test_case)
