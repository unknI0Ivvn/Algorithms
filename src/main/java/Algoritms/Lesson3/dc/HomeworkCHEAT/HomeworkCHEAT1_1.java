package Algoritms.Lesson3.dc.HomeworkCHEAT;

public class HomeworkCHEAT1_1 {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Домашнее задание №1");
        System.out.println("-------------------");
        System.out.println(pow(2,4));
        System.out.println("-------------------");


    }
    //Возвести число в степень
    //Домашнее задание №1
    private static long pow(long x, long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*pow(x,n-1);
    }

}
