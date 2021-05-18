package com.santiago.datastructuresalgorithms;

import java.util.ArrayList;
import java.util.List;

public class Mergesort {

    public int[] sort(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }


    void mergeSort(int[] nums, int start, int end){
        if (end - start+1 <= 1) return;
        int mid = start + (end - start)/ 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, start,mid, end);
    }

    void merge(int[] nums, int start, int mid, int end){
        int leftLimit = start;
        int righLimit = mid + 1;
        int[] temp = new int[end-start+1];
        int t = 0;

        while (leftLimit <= mid && righLimit <= end){
            if (nums[leftLimit] < nums[righLimit]){
                temp[t++] = nums[leftLimit++];
            }else{
                temp[t++] = nums[righLimit++];
            }
        }

        while (leftLimit <= mid) {
            temp[t++] = nums[leftLimit++];
        }
        while (righLimit <= end){
            temp[t++] = nums[righLimit++];
        }
        //Now copy sorted temp into original array
        for (int i = start; i <= end; i++){
            nums[i] = temp[i-start];
        }
    }
}
