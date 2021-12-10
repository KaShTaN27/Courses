package Chapter5;

public class Task24 {
    static final int BIG_BAG_VOLUME = 5;
    static final int SMALL_BAG_VOLUME = 1;
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        return (bigCount >= 0 && smallCount >= 0 && goal >= 0) && (bigCount >= goal / BIG_BAG_VOLUME) &&
                (goal / BIG_BAG_VOLUME * BIG_BAG_VOLUME + smallCount * SMALL_BAG_VOLUME >= goal);
    }
}
