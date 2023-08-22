class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        result = ""
        while columnNumber > 0:
            result = chr(ord("A") + (columnNumber - 1) % 26) + result
            columnNumber = (columnNumber - 1) // 26
        return result


test_cases = [1, 28, 701]
for test_case in test_cases:
    Solution().convertToTitle(test_case)
