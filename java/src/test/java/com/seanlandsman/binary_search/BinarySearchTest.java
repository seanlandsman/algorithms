package com.seanlandsman.binary_search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void canFindExpectedDataInMiddle() {
        // given
        int[] data = { 1, 3, 5, 7, 9, 11};
        int itemToFind = 7;

        // when
        int index = new BinarySearch().find(data, itemToFind);

        // then
        assertEquals(3, index);
    }

    @Test
    public void canFindExpectedDataAtStart() {
        // given
        int[] data = { 1, 3, 5, 7, 9, 11};
        int itemToFind = 1;

        // when
        int index = new BinarySearch().find(data, itemToFind);

        // then
        assertEquals(0, index);
    }

    @Test
    public void canFindExpectedDataAtEnd() {
        // given
        int[] data = { 1, 3, 5, 7, 9, 11};
        int itemToFind = 11;

        // when
        int index = new BinarySearch().find(data, itemToFind);

        // then
        assertEquals(5, index);
    }

    @Test
    public void cantFindNonExistantData() {
        // given
        int[] data = { 1, 3, 5, 7, 9, 11};
        int itemToFind = 6;

        // when
        int index = new BinarySearch().find(data, itemToFind);

        // then
        assertEquals(-1, index);
    }
}