package Algoritms.Lesson2.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //основное отличие от обычного поиска необазтельно перебирать от 0 до н
        // обычный поиск сложность н
        //достаточно 32 иретераций
        //отсортиована она может в убывающем или в возрастающем
        // длеим на два и нахходим части
        //разбиваем по полоам берем центр элемент и начинаем поиск если больше с правой если с меньшей то слева
        // делим каждый рах массив и раюоаьтем меньшей частью
        //Лог сложность
        int[] arr = {-5, -2, 0, 4, 6, 7, 8, 12, 15, 16, 21, 24, 30};

        int target = 12; // corner case

        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {

            mid = left + (right - left) / 2; //чтобы не скатиться в отрицательный элемент
            count++;
            if (arr[mid] == target) {
                System.out.println(count);
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(count);
        return -1;
    }
}
