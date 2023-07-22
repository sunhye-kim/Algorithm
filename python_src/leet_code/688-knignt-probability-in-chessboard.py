class Solution:
    x_dir = [-2, -1, 1, 2, 2, 1, -1, -2]
    y_dir = [-1, -2, -2, -1, 1, 2, 2, 1]

    visited = {}

    def dfs(self, n, k, row, column):
        if row < 0 or column < 0 or row >= n or column >= n:
            return 0
        if k == 0:
            return 1
        if (row, column, k) in self.visited:
            return self.visited[(row, column, k)]

        count = 0
        for i in range(8):
            new_x = column + self.x_dir[i]
            new_y = row + self.y_dir[i]

            count += self.dfs(n, k - 1, new_y, new_x)

        self.visited[(row, column, k)] = count
        return count

    def knightProbability(self, n, k, row, column):
        """
        :type n: int
        :type k: int
        :type row: int
        :type column: int
        :rtype: float
        """
        return self.dfs(n, k, row, column) / 8**k


if __name__ == "__main__":
    solution = Solution()
    result = solution.knightProbability(n=3, k=1, row=0, column=0)
    print(result)
