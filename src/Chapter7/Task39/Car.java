package Chapter7.Task39;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private  int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
    public String startEngine() {
        return "Car engine -> Starting ";
    }
    public String accelerate() {
        return "Car -> Accelerating ";
    }
    public String brake() {
        return "Car -> Braking ";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}
