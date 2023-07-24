class Solution:
    def myPow(self, x: float, n: int) -> float:
        return (x**n)

if __name__ == "__main__":
    test_cases = [[2.00000, 10], [2.10000, 3], [2.00000, -2]]
    for test_case in test_cases:
        x = test_case[0]
        n = test_case[1]
        result = Solution().myPow(x, n)
        print(result)