package com.seanlandsman.binary_search;

public class BinarySearch {
    public int find(int[] data, int itemToFind) {
        int low = 0;
        int high = data.length - 1;
        while(low <= high) {
            int mid = low + high;
            if (data[mid] == itemToFind) {
                return mid;
            }
            if (data[mid] > itemToFind) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
