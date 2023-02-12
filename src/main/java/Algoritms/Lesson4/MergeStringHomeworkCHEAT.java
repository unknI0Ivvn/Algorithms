package Algoritms.Lesson4;

import java.util.Arrays;

public class MergeStringHomeworkCHEAT {
    public static void main(String[] args) {
        //Homework 1
        //Сортировка слиянием
        String one = "abcde"; //adbgcke
        String two = "dgk";
        System.out.println(new MergeStringHomeworkCHEAT().mergeStrings(one, two));

    }


    private String mergeStrings(String one, String two) {
        int indexOne = 0;
        int indexTwo = 0;
        StringBuilder result = new StringBuilder();
        char[] resultArray = new char[one.length()+two.length()];
        boolean flag = false;
        for (int i = 0; i < one.length() + two.length(); i++) {
            if (indexOne < one.length() && indexTwo < two.length()) {
                //result.append(charOne).append(charTwo);
                //Итерация??????
                if(!flag){
                    resultArray[i] = one.charAt(indexOne++);
                } else {
                    resultArray[i]=two.charAt(indexTwo++);
                }
                flag = !flag;
                //result[0]
                //result[1]

                //result[2]
                //result[3]

            } else {
                if (indexOne < one.length()) {
                    resultArray[i]=one.charAt(indexOne++);
                }
                if (indexTwo < two.length()) {
                    resultArray[i]=two.charAt(indexTwo++);
                }
            }
        }
        return Arrays.toString(resultArray);
    }
}
