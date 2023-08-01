from itertools import combinations


class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        return combinations(range(1, n + 1), k)


if __name__ == "__main__":
    test_cases = [[4, 2], [1, 1]]
    for test_case in test_cases:
        n = test_case[0]
        k = test_case[1]
        result = Solution().combine(n, k)
        print(result)
