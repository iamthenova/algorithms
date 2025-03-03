package com.icenova.algorithms;

import com.icenova.algorithms.dto.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddTwoNumbersTest {

    private AddTwoNumbers solution;

    @BeforeEach
    void setUp() {
        solution = new AddTwoNumbers();
    }

    @Test
    void testExample1() {
        ListNode l1 = createListNode(new int[]{2, 4, 3});
        ListNode l2 = createListNode(new int[]{5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertListNodeEquals(new int[]{7, 0, 8}, result);
    }

    @Test
    void testExample2() {
        ListNode l1 = createListNode(new int[]{0});
        ListNode l2 = createListNode(new int[]{0});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertListNodeEquals(new int[]{0}, result);
    }

    @Test
    void testExample3() {
        ListNode l1 = createListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = createListNode(new int[]{9, 9, 9, 9});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertListNodeEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, result);
    }

    @Test
    void testDifferentLengths() {
        ListNode l1 = createListNode(new int[]{1, 2, 3});
        ListNode l2 = createListNode(new int[]{4, 5});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertListNodeEquals(new int[]{5, 7, 3}, result);
    }

    @Test
    void testWithZeros() {
        ListNode l1 = createListNode(new int[]{0, 1});
        ListNode l2 = createListNode(new int[]{0, 1});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertListNodeEquals(new int[]{0, 2}, result);
    }

    @Test
    void testLargeNumbers() {
        ListNode l1 = createListNode(new int[]{9, 9, 9, 9});
        ListNode l2 = createListNode(new int[]{1});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertListNodeEquals(new int[]{0, 0, 0, 0, 1}, result);
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