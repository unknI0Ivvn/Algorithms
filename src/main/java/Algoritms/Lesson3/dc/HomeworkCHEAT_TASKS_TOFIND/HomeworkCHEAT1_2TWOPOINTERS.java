package Algoritms.Lesson3.dc.HomeworkCHEAT_TASKS_TOFIND;

public class HomeworkCHEAT1_2TWOPOINTERS {
    public static void main(String[] args) {
        int[] arrOne = {100, 112, 256, 349, 770};    // 100 // вторая итерация // сравниваем следующий элемент с 100 //100
        int[] arrTwo = {72, 86, 113, 119, 446, 892};  // 72 - находим минимальный элемент из двух мссивов//то есть тут 86//113
        int k = 7;
        int[] ints= mergeArray(arrOne,arrTwo);
        int kPositionElement = getElementKposition(mergeArray(arrOne,arrTwo),k);


        // 72 86  100 113 и так повторям пока не закогнчится длина массива таким
        //таким образом сливаем и если заканчивается срапвнения и тогда мы дописывам
        //остаток
        System.out.println("-------------------");
        System.out.println("Домашнее задание №2");
        System.out.println("-------------------");
        System.out.println("Element on k position = " + kPositionElement);
       // System.out.println(Arrays.toString(ints));
       // System.out.println(ints[k-1]);

        //System.out.println(Arrays.toString(mergeArray(arrOne, arrTwo)));
        System.out.println("-------------------");
       // System.out.println(mergeArray(arrOne,arrTwo,k));



    }

    //Слияние массивов
    private static int mergeArray(int[] one, int[] two, int k) {
        int[] result = new int[one.length + two.length];
        int indexOne = 0;
        int indexTwo = 0;
        int curr = one[0];
         int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    indexOne++;
                    curr = elementOne;
                } else {
                    result[i] = elementTwo;
                    indexTwo++;
                    curr = elementTwo;
                }

                continue; // узнать что такое
            }
            if (indexOne < one.length && indexTwo >= two.length) {
                curr = one[indexOne];
                count++;
                indexOne++;

            }
            if (indexOne >= one.length && indexTwo < two.length) {
                curr = two[indexTwo];

                indexTwo++;
            }
            count++;
            if (count == k) {
                return curr;
            }
        }

        throw new IllegalArgumentException();

    }
    private static int getElementKposition(int[] array,int k){
        return array[k-1];

    }

    private static int[] mergeArray(int[] one, int[] two) {
        int[] result = new int[one.length + two.length];
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < result.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    result[i] = elementOne;
                    indexOne++;
                } else {
                    result[i] = elementTwo;
                    indexTwo++;

                }
                continue;
            }
            if(indexOne<one.length){
                result[i] = one[indexOne];
                indexOne++;
            }
            if(indexTwo<two.length){
                result[i]=two[indexTwo];
                indexTwo++;
            }
        }

return result;
    }

}
