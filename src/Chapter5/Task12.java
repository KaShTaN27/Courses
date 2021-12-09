package Chapter5;

public class Task12 {
    public static void main(String[] args) {
        printNumberInWord(6);
        printNumberInWord(13);
        printNumberInWord(7);
    }
    public static void printNumberInWord(int number) {
        String[] digitsNames = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
                                "SIX", "SEVEN", "EIGHT", "NINE"};
        System.out.println(number >= 0 && number <= 9 ? digitsNames[number] : "OTHER");
    }
}
