package Chapter4;

public class Task9 {
    static final int MINS_IN_HOUR = 60;
    static final int MINS_IN_DAY = 24 * MINS_IN_HOUR;
    static final int MINS_IN_YEAR = 365 * MINS_IN_DAY;
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        System.out.println(minutes >= 0 ? minutes + " min = " + minutes / MINS_IN_YEAR + " y and " + (minutes % MINS_IN_YEAR) / MINS_IN_DAY + " d" : "Invalid value");
    }
}
