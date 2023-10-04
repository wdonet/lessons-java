package net.wdo.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMissingElement {
    public static void main(String[] args) {

        int[] allElementsArray = new int[]{ 1, 2, 5, 6, 7, 18 };
        int[] missingElementGroup = new int[]{ 1, 2, 5, 6, 18 };
        int missed = FindMissingElement.findMissingElement(allElementsArray, missingElementGroup);
        System.out.println("Missed element [" + missed + "]");
    }

    public static int findMissingElement(int[] allElementsArray, int[] missingElementGroup) {

        /* STREAMS API */
//        It is not necessary to collect
        int totalSum = Arrays.stream(allElementsArray).boxed().collect(Collectors.toList()).stream().reduce(0, Integer::sum);
        int missedNum = Arrays.stream(missingElementGroup).boxed().reduce(0, Integer::sum);
//        Stream.of() works only if the arrays is a Wrapper of primitive data type
//        Stream.of(allElementsArray).reduce(0, Integer::sum);
//        return totalSum - missedNum;

        /* ARRAYS */
        int total = 0, missed = 0;
        for (int number : allElementsArray) {
            total += number;
        }
        for (int number : missingElementGroup) {
            missed += number;
        }
        return total - missed;
    }
}
