from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        less_num = ListNode()
        greater_num = ListNode()
        lnums, gnums = less_num, greater_num

        while head:
            if head.val >= x:
                gnums.next = head
                gnums = gnums.next
            else:
                lnums.next = head
                lnums = lnums.next

            head = head.next

        lnums.next = greater_num.next
        gnums.next = None

        return less_num.next


def create_linked_list(head: list):
    linked_list = ListNode(head[0])
    for num in head:
        linked_list.next = ListNode(num)
    return linked_list


if __name__ == "__main__":
    test_cases = [{"head": [1, 4, 3, 2, 5, 2], "x": 3}, {"head": [2, 1], "x": 2}]
    for test_case in test_cases:
        head = test_case["head"]
        x = test_case["x"]
        head_linked_list = create_linked_list(head)
        print(head_linked_list.val)
        print(head_linked_list.next.next)
        Solution().partition(head_linked_list, x)
