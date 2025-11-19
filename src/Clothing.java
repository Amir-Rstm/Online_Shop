public class Clothing extends Product implements Returnable {

    private String material;
    private String size;

    public Clothing(String name, double price, int id, String material, String size) {
        super(name, id, price);
        this.material = material;
        this.size = size;

    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.25;
    }

    @Override
    public int getDaysForReturn() {
        return 7;
    }

    public String getSize() {
        return size;
    }
}
