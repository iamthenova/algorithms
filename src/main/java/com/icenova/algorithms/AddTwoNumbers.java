package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;

public class AddTwoNumbers {

    //Example 1:
    //
    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.
    //
    //Example 2:
    //
    //Input: l1 = [0], l2 = [0]
    //Output: [0]
    //
    //Example 3:
    //
    //Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    //Output: [8,9,9,9,0,0,0,1]
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode;
        var parent = new ListNode();
        var root = parent;

        var rank = 0;

        while (l1 != null || l2 != null) {
            var val1 = l1 != null ? l1.val : 0;
            var val2 = l2 != null ? l2.val : 0;

            var sum = val1 + val2 + rank;
            if (sum >= 10) {
                rank = 1;
                sum -= 10;
            } else {
                rank = 0;
            }

            newNode = new ListNode(sum);
            parent.next = newNode;
            parent = newNode;

            l1 = l1 != null && l1.next != null ? l1.next : null;
            l2 = l2 != null && l2.next != null ? l2.next : null;
        }

        if (rank > 0) {
            parent.next = new ListNode(1);
        }

        return root.next;
    }
}
