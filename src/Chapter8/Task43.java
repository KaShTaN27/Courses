package Chapter8;

public class Task43 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 9, 5, 3, 1};
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            array[i] += array[array.length - i - 1];
            array[array.length - i - 1] = array[i] - array[array.length - i - 1];
            array[i] -= array[array.length - i - 1];
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
