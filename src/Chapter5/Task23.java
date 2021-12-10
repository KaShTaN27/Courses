package Chapter5;

public class Task23 {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static void numberToWords(int number) {
        String[] digitName = {"Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine"};
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        StringBuilder resultString = new StringBuilder();
        while(number != 0) {
            resultString.insert(0, digitName[number % 10] + " ");
            number = number / 10;
        }
        System.out.println(resultString);
    }
}
