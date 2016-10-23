package com.lufficc.addtwonumbers;

/**
 * Created by lufficc on 2016/10/23.
 */
public class Main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode result = new ListNode(sum % 10);
        ListNode currentNode = result;
        ListNode listNode1 = l1.next;
        ListNode listNode2 = l2.next;
        while (listNode1 != null || listNode2 != null) {
            sum = (listNode1 == null ? 0 : listNode1.val) + (listNode2 == null ? 0 : listNode2.val) + (sum / 10);
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
            listNode1 = listNode1 == null ? null : listNode1.next;
            listNode2 = listNode2 == null ? null : listNode2.next;
        }
        if (sum / 10 > 0) {
            currentNode.next = new ListNode(sum / 10);
        }
        return result;
    }
}
