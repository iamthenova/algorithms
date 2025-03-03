package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    
    private RemoveNthNodeFromEndOfList solution;
    
    @BeforeEach
    void setUp() {
        solution = new RemoveNthNodeFromEndOfList();
    }
    
    @Test
    void example1_removeSecondNodeFromEnd() {
        // Input: head = [1,2,3,4,5], n = 2
        // Output: [1,2,3,5]
        ListNode head = createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.removeNthFromEnd(head, 2);
        assertListNodeEquals(new int[]{1, 2, 3, 5}, result);
    }
    
    @Test
    void example2_removeSingleNode() {
        // Input: head = [1], n = 1
        // Output: []
        ListNode head = createListNode(new int[]{1});
        ListNode result = solution.removeNthFromEnd(head, 1);
        assertNull(result);
    }
    
    @Test
    void example3_removeLastNode() {
        // Input: head = [1,2], n = 1
        // Output: [1]
        ListNode head = createListNode(new int[]{1, 2});
        ListNode result = solution.removeNthFromEnd(head, 1);
        assertListNodeEquals(new int[]{1}, result);
    }
    
    @Test
    void removeFirstNode() {
        // Remove the first node (from the end, it's the last node)
        ListNode head = createListNode(new int[]{1, 2, 3});
        ListNode result = solution.removeNthFromEnd(head, 3);
        assertListNodeEquals(new int[]{2, 3}, result);
    }
    
    @Test
    void removeMiddleNode() {
        ListNode head = createListNode(new int[]{1, 2, 3});
        ListNode result = solution.removeNthFromEnd(head, 2);
        assertListNodeEquals(new int[]{1, 3}, result);
    }
    
    @Test
    void longList() {
        ListNode head = createListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListNode result = solution.removeNthFromEnd(head, 4);
        assertListNodeEquals(new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10}, result);
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