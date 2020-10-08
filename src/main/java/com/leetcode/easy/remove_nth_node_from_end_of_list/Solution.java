package com.leetcode.easy.remove_nth_node_from_end_of_list;

import com.leetcode.util.ListNode;

/**
 * Remove Nth Node From End of List
 *
 * Given the head of a linked list, remove the nth node
 * from the end of the list and return its head.
 *
 * Follow up: Could you do this in one pass?
 *
 * Constraints:
 * The number of nodes in the list is sz.
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *
 * Hint 1:
 * Maintain two pointers and update one with a delay of n steps.
 */

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode firstIterator = head;
        for (int i = 1; i < n; i++) {
            firstIterator = firstIterator.next;
        }

        ListNode secondIterator = null;
        while (firstIterator != null && firstIterator.next != null) {
            firstIterator = firstIterator.next;
            secondIterator = secondIterator == null
                    ? head
                    : secondIterator.next;
        }

        if (secondIterator == null) {
            return head.next;
        }

        if (secondIterator.next.next == null) {
            secondIterator.next = null;
            return head;
        }

        secondIterator.next.val = secondIterator.next.next.val;
        secondIterator.next.next = secondIterator.next.next.next;

        return head;
    }

}
