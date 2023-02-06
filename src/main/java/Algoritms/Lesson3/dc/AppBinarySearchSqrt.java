package Algoritms.Lesson3.dc;
//БИНАРНЫЙ ПОИСК
//БИНАРНЫЙ ПОИСК НАХОЖДЕНИЕ ЧИСЕЛ ИМЕЮЩИЙ КВАДРАТНЫЙ КОРЕНЬ
public class AppBinarySearchSqrt {
    public static void main(String[] args) {
        int number = 49;
        AppBinarySearchSqrt appBinarySearchSqrt = new AppBinarySearchSqrt();
        System.out.println("Is Square ?"+appBinarySearchSqrt.isSquare(number));
    }

    private boolean isSquare(int number){
        if(number<2){
            return true;
        }
        int left = 1;
        int right = 16;
        int mid = 0;
        while(left<=right){
            mid = left+(right - left)/2;
            if(mid*mid==number){
                return true;
            }
            if(mid*mid>number){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return false;
    }
}
