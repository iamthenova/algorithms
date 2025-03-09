package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;

public class SwapNodesInPairs {

    //Example 1:
    //Input: head = [1,2,3,4]
    //Output: [2,1,4,3]
    //
    //Example 2:
    //Input: head = []
    //Output: []
    //
    //Example 3:
    //Input: head = [1]
    //Output: [1]
    //
    //Example 4:
    //Input: head = [1,2,3]
    //Output: [2,1,3]

    //head = [1,2,3,4]
    //1c - 2n - 3 - 4
    //2 - 1p - 3c - 4n
    //
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode solution = null;
        var current = head;
        ListNode previous = null;
        var initialSwapHappened = false;

        while (current != null && current.next != null) {
            var next = current.next;

            current.next = next.next;
            next.next = current;
            if (previous != null) {
                previous.next = next;
            }

            previous = current;
            current = current.next;

            if (!initialSwapHappened) {
                solution = next;
                initialSwapHappened = true;
            }
        }

        return solution;
    }
}
