package Algoritms.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 63, 6, 8, 3, 4};
        int target = 4;
        int position = -1;

        //Time = 0(n)
        for (int i = 0; i < array.length; i++) { //цикл по массиву
            if (array[i] == target) { // сравнение если то /// ** [4+1] [4+1] [4+1] [4+1] [] [] []
                position = i; // присвоили значение позиции для искомого элемента
                break; // прервали цикл
            }
        }
        System.out.println(position);
    }
}
