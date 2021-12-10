package Chapter5;
import java.util.Scanner;
public class Task27 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, amount = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            amount++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(sum * 1.0 / amount));
    }
}
