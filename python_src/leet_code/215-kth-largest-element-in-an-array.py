from typing import List


class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        return nums[-k]


if __name__ == "__main__":
    test_cases = [{"nums": [3, 2, 1, 5, 6, 4], "k": 2}, {"nums": [3, 2, 3, 1, 2, 4, 5, 5, 6], k: 4}]
    for test_case in test_cases:
        Solution().findKthLargest(nums=test_case["nums"], k=test_case["k"])
