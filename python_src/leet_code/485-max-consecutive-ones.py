class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        consecutive_1 = 0
        max_num = 0
        for num in nums:
            if num == 1:
                consecutive_1 += 1
            else:
                max_num = consecutive_1 if consecutive_1 > max_num else max_num
                consecutive_1 = 0

        return consecutive_1 if consecutive_1 > max_num else max_num


if __name__ == "__main__":
    test_cases = [[1, 1, 0, 1, 1, 1], [1, 0, 1, 1, 0, 1]]
    for test_case in test_cases:
        result = Solution().findMaxConsecutiveOnes(test_case)
        print(result)
