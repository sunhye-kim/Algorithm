class Solution:
    def change(self, amount, coins):
        """
        :type amount: int
        :type coins: List[int]
        :rtype: int
        """
        dp = [0] * (amount + 1)
        dp[0] = 1

        for coin in coins:
            for j in range(coin, amount + 1):
                dp[j] += dp[j - coin]

        return dp[amount]


if __name__ == "__main__":
    test_cases = {
        1: {"amount": 5, "coins": [1, 2, 5]},
        2: {"amount": 3, "coins": [2]},
        3: {"amount": 10, "coins": [10]},
    }
    for key, test_case in test_cases.items():
        Solution().change(test_case["amount"], test_case["coins"])
