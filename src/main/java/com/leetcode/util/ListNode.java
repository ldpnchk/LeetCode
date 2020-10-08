package com.leetcode.util;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        ListNode other = (ListNode) object;
        if (val != other.val) {
            return false;
        }
        if (next == null && other.next != null) {
            return false;
        }
        if (next != null && !next.equals(other.next)) {
            return false;
        }
        return true;
    }

}
