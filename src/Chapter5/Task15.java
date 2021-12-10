package Chapter5;

public class Task15 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212   ));
    }

    public static boolean isPalindrome(int number) {
        StringBuilder strNumber = new StringBuilder();
        strNumber.append(Math.abs(number));
        return strNumber.reverse().toString().equals(String.valueOf(Math.abs(number)));
    }
}
