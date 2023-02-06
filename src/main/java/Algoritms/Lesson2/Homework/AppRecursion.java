package Algoritms.Lesson2.Homework;

public class AppRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7}; //18

        AppRecursion appRecursion = new AppRecursion();
        int summArray = appRecursion.summArray(arr,arr.length-1);
        System.out.println("Summ="+ summArray);

        int maxElement = appRecursion.maxArray(arr,arr.length-1);
        System.out.println("Max element = "+maxElement);
    }

    private int maxArray(int[] array,int index){
        if(index<0){
            return 0;
        }
        int element = maxArray(array,index-1);
        Math.max(array[index],element); //математическая операция сравнения встроенная
        //array[index]>element?array[index]:element
        return Math.max(array[index],element);
    }
    private int summArray(int[] array, int index) {
        if(index<0){
            return 0;
        }
    if (index==0) {
        return array[0];
    }

    int summ = summArray(array,index-1);
                        ///array[0]


    return array[index]+summ;
}
}
