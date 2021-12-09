package Chapter4;

public class Task2 {
    static final int BYTES_IN_KILOBYTE = 1024;

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0)
            System.out.println(kiloBytes + " KB = " + kiloBytes / BYTES_IN_KILOBYTE + " MB and " + kiloBytes % BYTES_IN_KILOBYTE
            + " KB");
        else
            System.out.println("Invalid value");
    }
}
