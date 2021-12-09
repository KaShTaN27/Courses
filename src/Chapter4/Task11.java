package Chapter4;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && (temperature <= 35 || (temperature <= 45 && summer));
    }
}
