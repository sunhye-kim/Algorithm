class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash_num = {}
        for i in range(len(nums)):
            other_num = target - nums[i]
            if other_num in hash_num:
                return [hash_num[other_num], i]
            hash_num[nums[i]] = i

        return []


if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 9
    print(Solution().twoSum(nums, target))

    nums = [3, 2, 3]
    target = 6
    print(Solution().twoSum(nums, target))
