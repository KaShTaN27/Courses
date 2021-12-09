package Chapter4;

public class Task7 {
    static final int LOWER_BORDER = 13;
    static final int HIGHER_BORDER = 19;
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 19, 99));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= LOWER_BORDER && num1 <= HIGHER_BORDER) ||
               (num2 >= LOWER_BORDER && num2 <= HIGHER_BORDER) ||
               (num3 >= LOWER_BORDER && num3 <= HIGHER_BORDER);
    }

    public static boolean isTeen(int number) {
        return number >= LOWER_BORDER && number <= HIGHER_BORDER;
    }
}
