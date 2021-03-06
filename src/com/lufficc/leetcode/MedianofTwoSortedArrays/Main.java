package com.lufficc.leetcode.MedianofTwoSortedArrays;

/**
 * Created by lufficc on 2016/10/26.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print(new Main().findMedianSortedArrays(new int[]{1, 2,9}, new int[]{3, 4, 5}));
    }

    /**
     There are two sorted arrays nums1 and nums2 of size m and n respectively.

     Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

     Example 1:
     nums1 = [1, 3]
     nums2 = [2]

     The median is 2.0
     Example 2:
     nums1 = [1, 2]
     nums2 = [3, 4]

     The median is (2 + 3)/2 = 2.5
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] sorted = new int[l];
        int i = 0, j = 0, k = 0;
        while (k < l) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    sorted[k] = nums1[i];
                    i++;
                } else {
                    sorted[k] = nums2[j];
                    j++;
                }
            } else {
                break;
            }
            k++;
        }

        while (i < nums1.length) {
            sorted[k] = nums1[i];
            k++;
            i++;
        }
        while (j < nums2.length) {
            sorted[k] = nums2[j];
            k++;
            j++;
        }
        if (l % 2 == 0) {
            return (sorted[l / 2] + sorted[l / 2 - 1]) * 1.0 / 2;
        }
        return sorted[l / 2] * 1.0;
    }
}
