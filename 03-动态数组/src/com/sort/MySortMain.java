package com.sort;

import com.sort.utils.LogarithmicDetector;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class MySortMain {
    public static void main(String[] args)
    {

        String result = LogarithmicDetector.testSortCorrect(10000,new Selection(),20);

        System.out.println("result = " + result);


    }
}


class Selection implements ArrayUtils {

    @Override
    public void sort(int[] arr)
    {
        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }


    }
}

class Bubble implements ArrayUtils {

    @Override
    public void sort(int[] arr)
    {
        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }
}

class Insert implements ArrayUtils {
    @Override
    public void sort(int[] arr)
    {
        if (arr.length < 2) {
            return;
        }


        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }


    }
}