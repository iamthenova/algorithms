package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SwapNodesInPairsTest {

    private SwapNodesInPairs solution;

    @BeforeEach
    void setUp() {
        solution = new SwapNodesInPairs();
    }

    @Test
    void testExample1() {
        // Input: head = [1,2,3,4]
        // Output: [2,1,4,3]
        ListNode head = createListNode(new int[]{1, 2, 3, 4});
        ListNode result = solution.swapPairs(head);
        assertListNodeEquals(new int[]{2, 1, 4, 3}, result);
    }

    @Test
    void testExample2() {
        // Input: head = []
        // Output: []
        ListNode head = null;
        ListNode result = solution.swapPairs(head);
        assertNull(result);
    }

    @Test
    void testExample3() {
        // Input: head = [1]
        // Output: [1]
        ListNode head = createListNode(new int[]{1});
        ListNode result = solution.swapPairs(head);
        assertListNodeEquals(new int[]{1}, result);
    }

    @Test
    void testExample4() {
        // Input: head = [1,2,3]
        // Output: [2,1,3]
        ListNode head = createListNode(new int[]{1, 2, 3});
        ListNode result = solution.swapPairs(head);
        assertListNodeEquals(new int[]{2, 1, 3}, result);
    }

    @Test
    void testLongList() {
        // Test with a longer list
        ListNode head = createListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        ListNode result = solution.swapPairs(head);
        assertListNodeEquals(new int[]{2, 1, 4, 3, 6, 5, 8, 7}, result);
    }

    private ListNode createListNode(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private void assertListNodeEquals(int[] expected, ListNode actual) {
        int i = 0;
        while (i < expected.length && actual != null) {
            assertEquals(expected[i], actual.val);
            actual = actual.next;
            i++;
        }
        assertEquals(expected.length, i);
        assertNull(actual);
    }
}