package Algoritms.Lesson4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arrTwo = {23, 5, 233, 3, 2, 28, 4};
        System.out.println("-------------------");
        System.out.println("Merge sort before:" + Arrays.toString(arrTwo));
        System.out.println("-------------------");
        mergeSort(arrTwo, arrTwo.length);
        System.out.println("-------------------");
        System.out.println("Merge sort after :" + Arrays.toString(arrTwo));
        System.out.println("-------------------");




    }

    private static void mergeArrayTwo(int[] one, int[] two, int[] array) {
        int indexOne = 0;
        int indexTwo = 0;
        int i = 0;
        while (indexOne < one.length && indexTwo < two.length) {
            int elementOne = one[indexOne];
            int elementTwo = two[indexTwo];
            if (elementOne > elementTwo) {
                array[i++] = elementOne;
                indexOne++;
            } else {
                array[i++] = elementTwo;
                indexTwo++;
            }

        }
        while (indexOne < one.length) {
            array[i++] = one[indexOne];
            indexOne++;
        }
        while (indexTwo < two.length) {
            array[i++] = two[indexTwo];
            indexTwo++;
        }
    }

    private static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];

        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = array[i];

        }
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        mergeArray(left, right, array);



    }

    private static void mergeArray(int[] one, int[] two, int[] array) {

        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    array[i] = elementOne;
                    indexOne++;
                } else {
                    array[i] = elementTwo;
                    indexTwo++;

                }
                continue;
            }
            if (indexOne < one.length) {
                array[i] = one[indexOne];
                indexOne++;
            }
            if (indexTwo < two.length) {
                array[i] = two[indexTwo];
                indexTwo++;
            }

        }


    }

}
