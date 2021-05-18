package com.santiago.datastructuresalgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuicksortTest {
    // O(n log n) average
    // O(n^2) worst

    @Test
    void sortArrayWithMultipleElements(){
        //setup
        Quicksort quicksort =  new Quicksort();

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(7);

        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(3);
        unsorted.add(7);
        unsorted.add(2);
        unsorted.add(4);
        unsorted.add(1);

        //execute
        List<Integer> actual = quicksort.sort(unsorted);
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void sortArrayWithOneElement(){
        //setup
        Quicksort quicksort =  new Quicksort();

        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(1);

        //execute
        List<Integer> actual = quicksort.sort(unsorted);
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void sortArrayWithNoElements(){
        //setup
        Quicksort quicksort =  new Quicksort();

        List<Integer> expected = new ArrayList<>();

        List<Integer> unsorted = new ArrayList<>();

        //execute
        List<Integer> actual = quicksort.sort(unsorted);
        //assert
        assertEquals(expected, actual);
    }




}
