package com.leetcode.easy.delete_node_in_a_linked_list;

import com.leetcode.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_1() {

        ListNode listNode = new ListNode(9);
        ListNode listNode2 = new ListNode(1, listNode);
        ListNode listNode3 = new ListNode(5, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);

        new Solution().deleteNode(listNode3);

        ListNode expectedListNode = new ListNode(9);
        ListNode expectedListNode2 = new ListNode(1, expectedListNode);
        ListNode expectedListNode3 = new ListNode(4, expectedListNode2);

        assertEquals(expectedListNode3, listNode4);
    }

    @Test
    public void test_2() {

        ListNode listNode = new ListNode(9);
        ListNode listNode2 = new ListNode(1, listNode);
        ListNode listNode3 = new ListNode(5, listNode2);
        ListNode listNode4 = new ListNode(4, listNode3);

        new Solution().deleteNode(listNode2);

        ListNode expectedListNode = new ListNode(9);
        ListNode expectedListNode2 = new ListNode(5, expectedListNode);
        ListNode expectedListNode3 = new ListNode(4, expectedListNode2);

        assertEquals(expectedListNode3, listNode4);
    }

    @Test
    public void test_3() {

        ListNode listNode = new ListNode(4);
        ListNode listNode2 = new ListNode(3, listNode);
        ListNode listNode3 = new ListNode(2, listNode2);
        ListNode listNode4 = new ListNode(1, listNode3);

        new Solution().deleteNode(listNode2);

        ListNode expectedListNode = new ListNode(4);
        ListNode expectedListNode2 = new ListNode(2, expectedListNode);
        ListNode expectedListNode3 = new ListNode(1, expectedListNode2);

        assertEquals(expectedListNode3, listNode4);
    }

    @Test
    public void test_4() {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(0, listNode);

        new Solution().deleteNode(listNode2);

        ListNode expectedListNode = new ListNode(1);

        assertEquals(expectedListNode, listNode2);
    }

    @Test
    public void test_5() {

        ListNode listNode = new ListNode(-99);
        ListNode listNode2 = new ListNode(5, listNode);
        ListNode listNode3 = new ListNode(-3, listNode2);

        new Solution().deleteNode(listNode3);

        ListNode expectedListNode = new ListNode(-99);
        ListNode expectedListNode2 = new ListNode(5, expectedListNode);

        assertEquals(expectedListNode2, listNode3);
    }

}
