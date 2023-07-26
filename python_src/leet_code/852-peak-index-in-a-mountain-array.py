from typing import List


class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        return arr.index(max(arr))


if __name__ == "__main__":
    test_cases = [[0, 1, 0], [0, 2, 1, 0], [0, 10, 5, 2]]
    for test_case in test_cases:
        result = Solution().peakIndexInMountainArray(test_case)
        print(result)
