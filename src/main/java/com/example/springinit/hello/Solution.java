package com.example.springinit.hello;

/**
 * @author Ziqi Wang
 * @date 2/23/22 20:34
 */

//输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        输出：[1,2,2,3,5,6]
public class Solution {
    public int[] mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {

        if (nums2.length == 0) {
            return nums1;
        }
        int i = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {

                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }
        if (n >= 0) {
            for (int j = i; j >= 0 ; j--) {
                nums1[j] = nums2[n];
                n--;
            }
        }


        return nums1;

    }
}
