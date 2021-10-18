package com.Core.Question2;

import java.util.Arrays;

public class SortBinaryArray_Q2 {

  // Function to sort a binary array in linear time
    public static void sort(int[] arr)
    {
        // count number of 0's
        int count = 0;
        for (int value: arr)
        {
            if (value == 0) {
                count++;

            }
        }
          //System.out.println(count);
        // put 0's at the beginning
        int i = 0;
        while (count-- != 0) {
            arr[i] = 0;
            i++;
        }
       //System.out.println(i);

        // fill all remaining elements by 1
        while (i < arr.length) {
            arr[i] = 1;
            i++;
        }
    }

    public static void main (String[] args)
    {
        int[] num = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

        sort(num);

        // print the rearranged array
        System.out.println(Arrays.toString(num));
    }
}
