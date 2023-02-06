package Algoritms.Lesson3.dc;

//НАХОЖДЕНИЕ МАКИМАЛЬНОГО ЗНАЧЕНИЕ МАКИМАЛЬНОГО ЭЛЕМЕНТА

public class AppDc {
    public static void main(String[] args) {
        int [] arr ={9,676,15,15,7,8989}; //18
        AppDc appDC = new AppDc();
        int maxElement = appDC.maxArray(arr,0,arr.length);
        System.out.println("Max element =" +maxElement);

    }

    private int maxArray(int[] array,int index,int end){
        if(array.length<2)
        {
            return array.length ==0?-1:array[0];
        }

        if(index==end-1){
            return array[index]; // array:[9,20,15,15,7,14]

        }
        int mid = (end+index)/2;
        int maxLeft=maxArray(array,index,mid);
        int maxRight = maxArray(array,mid,end);
        return Math.max(array[index],Math.max(maxLeft,maxRight));

//        int element = maxArray(array,index-1);
//        Math.max(array[index],element); //математическая операция сравнения встроенная
//        //array[index]>element?array[index]:element
//        return Math.max(array[index],element);
    }
}
