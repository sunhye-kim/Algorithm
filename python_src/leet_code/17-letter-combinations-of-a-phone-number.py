class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        letters = {
            2: ["a", "b", "c"],
            3: ["d", "e", "f"],
            4: ["g", "h", "i"],
            5: ["j", "k", "l"],
            6: ["m", "n", "o"],
            7: ["p", "q", "r", "s"],
            8: ["t", "u", "v"],
            9: ["w", "x", "y", "z"],
        }

        def backtracking(combination, index):
            if len(digits) == 0:
                return

            if len(digits) == index:
                result.append(combination)
            else:
                for digit in letters[int(digits[index])]:
                    backtracking(combination + digit, index + 1)

        result = []
        backtracking("", 0)
        return result


if __name__ == "__main__":
    test_cases = ["23", "", "2"]
    for test_case in test_cases:
        Solution().letterCombinations(test_case)
