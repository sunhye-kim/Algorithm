class Solution(object):
    def longestSubsequence(self, arr, difference):
        """
        :type arr: List[int]
        :type difference: int
        :rtype: int
        """
        result_dict = {}
        for i in arr:
            if (i - difference) in result_dict:
                result_dict[i] = result_dict[i - difference] + 1
            else:
                result_dict[i] = 1

        return max(result_dict.values())


if __name__ == "__main__":
    arr = [1, 5, 7, 8, 5, 3, 4, 2, 1]
    print(Solution().maxSubArray(arr, -2))
