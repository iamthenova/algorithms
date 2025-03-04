package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;

public class MergeTwoSortedLists {

    //Example 1:
    //Input: list1 = [1,2,4], list2 = [1,3,4]
    //Output: [1,1,2,3,4,4]
    //
    //Example 2:
    //Input: list1 = [], list2 = []
    //Output: []
    //
    //Example 3:
    //Input: list1 = [], list2 = [0]
    //Output: [0]
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var root = new ListNode();
        var current = root;

        while (list1 != null || list2 != null) {
            var listOneValue = list1 == null ? Integer.MAX_VALUE : list1.val;
            var listTwoValue = list2 == null ? Integer.MAX_VALUE : list2.val;

            if (listOneValue <= listTwoValue) {
                current.next = list1;

                if (list1 != null) {
                    list1 = list1.next;
                }
            } else {
                current.next = list2;

                if (list2 != null) {
                    list2 = list2.next;
                }
            }

            current = current.next;
        }

        return root.next;
    }
}
