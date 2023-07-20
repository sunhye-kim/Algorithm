class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(0, len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if (nums[i] + nums[j]) == target:
                    return [i, j]

if __name__ == "__main__":
    nums = [2,7,11,15]
    target=9
    print(Solution().twoSum(nums, target))

    nums = [3,2,3]
    target=6
    print(Solution().twoSum(nums, target))