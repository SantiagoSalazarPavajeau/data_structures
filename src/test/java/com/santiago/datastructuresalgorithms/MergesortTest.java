package com.santiago.datastructuresalgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergesortTest {
    // O(n log n) Time
    // O(n) Space
    @Test
    void sortArrayWithMultipleElements(){
        //setup
        Mergesort mergesort =  new Mergesort();

        int[] expected = new int[]{1,2,3,4,7};

        int[] unsorted = new int[]{3,7,2,4,1};

        //execute
        int[] actual = mergesort.sort(unsorted);
        //assert
        assertTrue(Arrays.equals(expected, actual));
    }

}
