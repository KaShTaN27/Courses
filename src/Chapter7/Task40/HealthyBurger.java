package Chapter7.Task40;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(double price, String meat) {
        super("Healthy", meat, price, "Brown rye");
    }

    private double healthyExtra1Price;
    private String healthyExtra1Name;

    private double healthyExtra2Price;
    private String healthyExtra2Name;

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    @Override
    public double itemizehamburger() {
        double hamburgerPrice = super.itemizehamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
