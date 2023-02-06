package Algoritms.Lesson3.dc;

public class AppUniArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9,12,15,14,12,10,6};
        AppUniArray appUniArray = new AppUniArray();
       int max = appUniArray.findmax(arr,0,arr.length);
        //отсортирован по возрастанию
        //отсортирован по убывающему порядку
        //revert делает диф
        //commit
        //amend

        //pro GIT - книжка
        System.out.println("Max element = "+max);
    }
    private int findmax(int[] array,int left,int right) {
        if(left==right){
            return array[left];
        }
        if(right - left == 1)
        {
            return Math.max(array[left],array[right]);
        }
        int mid=(left+right)/2;
        if(array[mid]>array[mid-1]&&array[mid]>array[mid+1]) {
        return array[mid];
        }
        if(array[mid]>array[mid-1]){
            return findmax(array,mid+1,right);
        } else{
            return findmax(array,left,mid-1);
        }

    }
}
