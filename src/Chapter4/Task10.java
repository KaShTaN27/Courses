package Chapter4;

public class Task10 {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, 1, -1);
        printEqual(1, 2, 3);
    }
    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
            return;
        }
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }
}
