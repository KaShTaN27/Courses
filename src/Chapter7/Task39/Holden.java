package Chapter7.Task39;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> start engine";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerating";
    }

    @Override
    public String brake() {
        return "Holden -> braking";
    }
}
