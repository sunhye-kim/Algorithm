from typing import List


class Solution:
    # 상, 우, 하, 좌
    dx = [0, 1, 0, -1]
    dy = [-1, 0, 1, 0]
    result = False

    def dfs(self, now_x, now_y, target, matrix, visited, m, n):
        if visited[now_y][now_x] or self.result:
            return

        visited[now_y][now_x] = True
        if matrix[now_y][now_x] == target:
            self.result = True
            return

        for i in range(4):
            new_x = now_x + self.dx[i]
            new_y = now_y + self.dy[i]

            if 0 <= new_x < n and 0 <= new_y < m:
                if matrix[new_y][new_x] == target:
                    self.result = True
                    return
                self.dfs(new_x, new_y, target, matrix, visited, m, n)

        return

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])

        visited = [[False for _ in range(n)] for _ in range(m)]
        self.dfs(0, 0, target, matrix, visited, m, n)
        return self.result


if __name__ == "__main__":
    test_cases = [
        {"matrix": [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], "target": 3},
        {"matrix": [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], "target": 13},
    ]

    for test_case in test_cases:
        Solution().searchMatrix(test_case["matrix"], test_case["target"])
