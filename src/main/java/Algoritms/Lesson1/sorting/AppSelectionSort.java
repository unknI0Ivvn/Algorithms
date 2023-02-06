package Algoritms.Lesson1.sorting;

import java.sql.Array;
import java.util.Arrays;

public class AppSelectionSort {
    public static void main(String[] args) {
        int [] array = {10,2,3,5,6,1,7,8,0};
        for(int j = 0;j< array.length;j++){
            int maxPos = j;
            System.out.println("Start position ="+j);
            System.out.println(Arrays.toString(array));
            for (int i = j; i <array.length ; i++) {
                if(array[i]>array[maxPos]){
                    maxPos=i;
                }

            }
            System.out.println("Max position = "+maxPos);
            int temp = array[j];
            array[j]=array[maxPos];
            array[maxPos] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }


}
