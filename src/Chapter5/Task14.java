package Chapter5;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end >= start)
            for (; start <= end; start++)
                sum += isOdd(start) ? start : 0;
        else
            return -1;
        return sum;
    }
    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
