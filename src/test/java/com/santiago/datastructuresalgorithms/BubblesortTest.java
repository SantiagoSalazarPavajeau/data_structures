package com.santiago.datastructuresalgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubblesortTest {

    @Test
    void sortArrayWithMultipleElements(){
        //setup
        Bubblesort bubblesort =  new Bubblesort();

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
        List<Integer> actual = bubblesort.sort(unsorted);
        //assert
        assertEquals(expected, actual);
    }
}
