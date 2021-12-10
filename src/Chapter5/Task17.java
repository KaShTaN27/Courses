package Chapter5;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;
        int sum = 0;
        while (number != 0) {
            if ((number % 10) % 2 == 0)
                sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
