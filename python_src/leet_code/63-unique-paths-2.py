from functools import cache
from typing import List


class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        @cache
        def dfs(i, j):
            if i >= len(obstacleGrid) or j >= len(obstacleGrid[0]) or obstacleGrid[i][j] == 1:
                return 0
            if i == len(obstacleGrid) - 1 and j == len(obstacleGrid[0]) - 1:
                return 1
            return dfs(i + 1, j) + dfs(i, j + 1)

        return dfs(0, 0)


if __name__ == "__main__":
    test_cases = {1: [[0, 0, 0], [0, 1, 0], [0, 0, 0]], 2: [[0, 1], [0, 0]], 3: [[0]]}
    for key, test_case in test_cases.items():
        result = Solution().uniquePathsWithObstacles(test_case)
        print(result)
        print("=" * 88)
