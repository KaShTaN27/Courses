package Chapter8;

import java.util.Scanner;

public class Task42 {

    public static void main(String[] args) {
        System.out.println("Min element: " + findMin(readElements(getInteger())));
    }

    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        return scanner.nextInt();
    }

    public static int[] readElements(int size) {
        Scanner scanner1 = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner1.nextInt();
        }
        System.out.println();
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

}
