package Chapter4;

public class Task1 {
    public static void main(String[] args) {
        printConversation(1.5);
        printConversation(10.25);
        printConversation(-5.6);
        printConversation(25.42);
        printConversation(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        return  kilometersPerHour >= 0 ? Math.round(kilometersPerHour * 0.62) : -1;
    }

    public static void printConversation(double kilometersPerHour) {
        if (kilometersPerHour >= 0)
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        else
            System.out.println("Invalid value");
    }
}