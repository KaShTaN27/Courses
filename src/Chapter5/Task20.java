package Chapter5;

public class Task20 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (isNotValid(num1) || isNotValid(num2))
            return -1;
        do {
            if (num1 > num2)
                num1 -= num2;
            if (num2 > num1)
                num2 -= num1;
        } while (num1 != num2);
        return num1;
    }
    public static boolean isNotValid(int number) {
        return number < 10;
    }
}
