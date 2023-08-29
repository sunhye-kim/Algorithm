class Solution:
    def bestClosingTime(self, customers: str) -> int:
        score = 0
        max_score = 0
        best_hour = -1
        for idx, customer in enumerate(customers):
            if customer == "Y":
                score += 1
                if score > max_score:
                    max_score = score
                    best_hour = idx
            else:
                score -= 1

        return best_hour + 1


test_cases = ["YYNY", "NNNNN", "YYYY"]
for test_case in test_cases:
    Solution().bestClosingTime(test_case)
