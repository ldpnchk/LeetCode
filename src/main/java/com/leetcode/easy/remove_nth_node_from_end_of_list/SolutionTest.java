package com.leetcode.easy.remove_nth_node_from_end_of_list;

import com.leetcode.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        ListNode listNode = new ListNode(5);
        ListNode listNode2 = new ListNode(4, listNode);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode4 = new ListNode(2, listNode3);
        ListNode listNode5 = new ListNode(1, listNode4);

        listNode5 = new Solution().removeNthFromEnd(listNode5, 2);

        ListNode expectedListNode = new ListNode(5);
        ListNode expectedListNode2 = new ListNode(3, expectedListNode);
        ListNode expectedListNode3 = new ListNode(2, expectedListNode2);
        ListNode expectedListNode4 = new ListNode(1, expectedListNode3);

        assertEquals(expectedListNode4, listNode5);
    }

    @Test
    public void test_2() {

        ListNode listNode = new ListNode(1);

        listNode = new Solution().removeNthFromEnd(listNode, 1);

        ListNode expectedListNode = null;

        assertEquals(null, listNode);
    }

    @Test
    public void test_3() {

        ListNode listNode = new ListNode(2);
        ListNode listNode2 = new ListNode(1, listNode);

        listNode2 = new Solution().removeNthFromEnd(listNode2, 1);

        ListNode expectedListNode = new ListNode(1);

        assertEquals(expectedListNode, listNode2);
    }

    @Test
    public void test_4() {

        ListNode listNode = new ListNode(2);
        ListNode listNode2 = new ListNode(1, listNode);

        listNode2 = new Solution().removeNthFromEnd(listNode2, 2);

        ListNode expectedListNode = new ListNode(2);

        assertEquals(expectedListNode, listNode2);
    }

}
