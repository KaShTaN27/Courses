package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        int[] arr = getInteger(6);
        printArray(arr);
        int[] sorted = sortIntegers(arr);
        printArray(sorted);
    }

    public static int[] getInteger(int sizeArray) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Enter " + (i + 1) + " array element: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArr = Arrays.copyOf(array, array.length);
        int temp;
        boolean NeedSort = true;
        while (NeedSort) {
            NeedSort = false;
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i+ 1] = temp;
                    NeedSort = true;
                }
            }
        }
        return sortedArr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
