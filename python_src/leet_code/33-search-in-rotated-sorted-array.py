from typing import List


class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        return -1


if __name__ == "__main__":
    test_cases = [
        {"nums": [4, 5, 6, 7, 0, 1, 2], "target": 0},
        {"nums": [4, 5, 6, 7, 0, 1, 2], "target": 3},
        {"nums": [1], "target": 0},
    ]
