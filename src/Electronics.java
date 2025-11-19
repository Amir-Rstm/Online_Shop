public class Electronics extends Product {

    private int batteryCapacity;
    private int warrantyPeriod;


    public Electronics(String name, int id, double price, int batteryCapacity, int warrantyPeriod) {
        super(name, id, price);
        this.warrantyPeriod = warrantyPeriod;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
