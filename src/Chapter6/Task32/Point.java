package Chapter6.Task32;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    public  double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - getX()), 2) + Math.pow((y - getY()), 2));
    }
    public  double distance(Point anotherPoint) {
        return distance(anotherPoint.x, anotherPoint.y);
    }
}
