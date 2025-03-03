package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;

public class RemoveNthNodeFromEndOfList {

    //Example 1:
    //
    //Input: head = [1,2,3,4,5], n = 2
    //Output: [1,2,3,5]
    //
    //Example 2:
    //
    //Input: head = [1], n = 1
    //Output: []
    //
    //Example 3:
    //
    //Input: head = [1,2], n = 1
    //Output: [1]
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;

        return res.next;
    }
}
