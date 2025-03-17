package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    void searchInsert_whenTargetExists_returnsCorrectIndex() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        
        int result = searchInsertPosition.searchInsert(nums, target);
        
        assertEquals(2, result);
    }

    @Test
    void searchInsert_whenTargetDoesNotExist_returnsInsertPosition() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        
        int result = searchInsertPosition.searchInsert(nums, target);
        
        assertEquals(1, result);
    }

    @Test
    void searchInsert_whenTargetIsGreaterThanAllElements_returnsLastIndexPlusOne() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        
        int result = searchInsertPosition.searchInsert(nums, target);
        
        assertEquals(4, result);
    }

    @Test
    void searchInsert_whenTargetIsSmallerThanAllElements_returnsZero() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        
        int result = searchInsertPosition.searchInsert(nums, target);
        
        assertEquals(0, result);
    }

    @Test
    void searchInsert_withSingleElementArray_handlesCorrectly() {
        int[] nums = {5};
        
        assertEquals(0, searchInsertPosition.searchInsert(nums, 5));
        assertEquals(0, searchInsertPosition.searchInsert(nums, 3));
        assertEquals(1, searchInsertPosition.searchInsert(nums, 7));
    }

    @Test
    void searchInsert_() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 10;

        int result = searchInsertPosition.searchInsert(nums, target);

        assertEquals(5, result);
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void searchInsert_withVariousInputs_returnsExpectedResults(int[] nums, int target, int expected) {
        assertEquals(expected, searchInsertPosition.searchInsert(nums, target));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
            // Basic cases
            Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
            Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
            Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
            Arguments.of(new int[]{1, 3, 5, 6}, 0, 0),
            
            // Edge cases
            Arguments.of(new int[]{1}, 1, 0),
            Arguments.of(new int[]{1}, 0, 0),
            Arguments.of(new int[]{1}, 2, 1),
            
            // Larger arrays
            Arguments.of(new int[]{1, 3, 5, 7, 9, 11}, 6, 3),
            Arguments.of(new int[]{1, 3, 5, 7, 9, 11}, 10, 5),
            
            // Duplicate elements
            Arguments.of(new int[]{1, 3, 3, 5, 5, 6}, 3, 1), // Should return first occurrence
            Arguments.of(new int[]{1, 3, 3, 5, 5, 6}, 4, 3)  // Should insert between 3 and 5
        );
    }
}