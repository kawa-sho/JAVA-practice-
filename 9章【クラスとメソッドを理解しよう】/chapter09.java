public class Chapter09 {
    public static void main(String[] args) {
        // 燃費（Km/L）
        double fuelCost = 12.5;
        // 残量（L）
        double fuelAmount = 55.0;

        Car car = new Car(fuelCost, fuelAmount);

        car.move(20);
        System.out.println("残量は、" + car.getFuelAmount() + "です");
    }
}

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    public Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }

    public void move(int num) {
        System.out.println(num + " km 走ります");
        this.fuelAmount -= (num / fuelCost);
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }
}