package Chapter4;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println( shouldWakeUp(false, 2));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return hourOfDay >= 0 && hourOfDay <= 23 && !(hourOfDay >= 8 && hourOfDay <= 22) && barking;
    }
}
