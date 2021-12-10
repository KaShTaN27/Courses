package Chapter5;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int temp = number;
        while (number / 10 != 0)
            number = number / 10;
        return number + temp % 10;
    }
}
