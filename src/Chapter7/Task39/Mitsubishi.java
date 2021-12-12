package Chapter7.Task39;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> braking";
    }
}
