public class Cart {
    private final Product[] products = new Product[10];

    private int itemCount = 0;

    public void addProduct(Product p) {
        if (itemCount < 10) {
            products[itemCount] = p;
            itemCount++;
            System.out.println(p.getName() + "has been added");
        } else {
            System.out.println("cart is full");
        }
    }

    public double calculateTotalCost() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total = total + products[i].calculateFinalPrice();
        }
        return total;
    }
}
