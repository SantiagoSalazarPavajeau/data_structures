package com.santiago.datastructuresalgorithms;

 import java.util.*;

public class Quicksort {

    public List<Integer> sort(List<Integer> array){
        quicksortRecursion(array, 0, array.size()-1);
        return array;
    }

    private void quicksortRecursion(List<Integer> array, int start, int end) {
        if(start >= end){
            return;
        }
        int pivot = array.get((start + end) /2);
        int partitionPoint = partition(array, start, end, pivot);
        quicksortRecursion(array, start, partitionPoint -1);
        quicksortRecursion(array, partitionPoint, end);

    }

    private int partition(List<Integer> array, int start, int end, int pivot) {
        while(start<=end){
            while(array.get(start) < pivot){
                start++;
            }
            while(array.get(end) > pivot){
                end--;
            }
            if(start<= end){
                Collections.swap(array, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

}
