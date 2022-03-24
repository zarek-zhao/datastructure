package com.sort.utils;

import com.sort.ArrayUtils;

import java.util.Arrays;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 * 对数器，检测算法是否正确
 */
public class LogarithmicDetector {

    static int[] getRandomArray(int capacity)
    {
        int[] arr = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) - 50;
        }

        return arr;
    }


    public static String testSortCorrect(int number, ArrayUtils arrayUtils, int arrCapacity)
    {
        boolean flag = true;

        for (int m = 0; m < number; m++) {
            int[] arr = getRandomArray(arrCapacity);
            int[] compareArr = new int[arrCapacity];

            System.arraycopy(arr, 0, compareArr, 0, arr.length);

            arrayUtils.sort(arr);
            Arrays.sort(compareArr);

            for (int n = 0; n < arr.length; n++) {
                if (arr[n] != compareArr[n]) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }

        }

        return flag ? "算法正确" : "算法错误";
    }

}