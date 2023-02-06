package Algoritms.Lesson2.Recursion;

public class App {
    public static void main(String[] args) {
        char [] arr = new char []{'H','e','l','l','o'};

         // рекурсия - это медот вызывающей сам себя

        //T 0(N)
        //S 0(N)
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(""+arr[i]);
            //Два понятия
            //Первый случай - когда не нужно в дальшнейшем использовать не надо использовать рекурсивный метод чтобы получить результат
            //Второй - рекурсивыный где есть рекурсия
            //Базовый и рекурсивный
            //Базовый - где с пустым массивов или со дноим элепментом
            //все отслаьное рекурсивный
        }
        //T O (N)
        //S O (N)
        System.out.println();
        print(0,arr);

        //T O(N)
        //S 0(1)
    }
    public static void print(int index, char[] arr){
        if(arr == null||index>=arr.length){
            return;
        }
        print(index+1,arr);
        System.out.println(" "+arr[index]);

    }

}                                                     ////////////////////////
