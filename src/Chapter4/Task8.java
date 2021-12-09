package Chapter4;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double radius) {
        return radius >= 0 ? radius * radius * Math.PI : -1d;
    }

    public static double area(double x, double y) {
        return x >= 0 && y >= 0 ? x * y : -1d;
    }

}
