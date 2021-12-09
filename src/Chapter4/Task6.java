package Chapter4;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
    public static boolean hasEqualSum(int num1, int num2, int result) {
        return num1 + num2 == result;
    }
}
