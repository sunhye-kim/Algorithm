# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result = []

        def _in_order_traversal(root):
            if root is None:
                pass
            else:
                _in_order_traversal(root.left)
                result.append(root.val)
                _in_order_traversal(root.right)

        _in_order_traversal(root)

        return result


if __name__ == "__main__":
    test_cases = [[1, None, 2, 3], [], [1]]
    for test_case in test_cases:
        root = test_case
        result = Solution().inorderTraversal(root=root)
        print(result)
