class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if target in nums:
            return True
        return False


if __name__ == "__main__":
    test_cases = [
        {"nums": [2, 5, 6, 0, 0, 1, 2], "target": 0},
        {"nums": [2, 5, 6, 0, 0, 1, 2], "target": 3},
    ]
