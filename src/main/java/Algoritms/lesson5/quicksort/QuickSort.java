package Algoritms.lesson5.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {122,56,22,0,9,3,5,125}; //corner cases
        //int[] array = new int [0];

        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        int[] arrayTwo = {122,56,22,0,9,3,5,125};
        Arrays.sort(arrayTwo); //встроенная сортировка
        System.out.println(Arrays.toString(arrayTwo));

    }
    private static void quickSort(int[] array,int start,int end){

        if(start<end){
            int indexPivot = getIndexPivot(array,start,end);
            quickSort(array,start,indexPivot-1);
            quickSort(array,indexPivot+1,end);

        }
//        if (array.length == 0) {
//            return;
//        }
//
//    if(start==end){
//        return;
//    }


    //метод для ракировки
//        int indexPivot = getIndexPivot(array,start,end);
//    quickSort(array,start,indexPivot-1);
//    quickSort(array,indexPivot+1,end); //делит массивы рекурсия идет до тех пор пока не вызывается базовый случай
    }
    private static int getIndexPivot(int[]array,int start,int end){
        int pivot = array[end]; //15
        int indexPivot = start; //index 0
        //Логика
        //{34, 56, 22, 78, 9, 3, 5, 15}
        //{9,_34,56,22,78,3,5,15}
        //{9,3,_22,78,34,56,5,15}
        //{9,3,5,_78,34,56,22,15}
        //{9,3,5,_15,34,56, 22, 78}
        for(int i = start;i<end;i++){
            if(array[i]<=pivot){
                swap(array,indexPivot,i);
//                int temp = array[indexPivot];
//                array[indexPivot]=array[i];
//                array[i]=temp;
                indexPivot++;

            }

        }
        swap(array,indexPivot,end);
//        int temp= array[indexPivot];
//        array[indexPivot]=array[end];
//        array[end]=temp;
        return indexPivot;
    }
    private static void swap(int[] array,int first,int second){
        int temp=array[first];
        array[first]=array[second];
        array[second] = temp;
    }

}
