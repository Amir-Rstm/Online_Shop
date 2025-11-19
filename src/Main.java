public class Main {
    public static void main(String[] args) {

        Cart myCart = new Cart();

        Electronics laptop = new Electronics("MacBook Pro", 101, 1000, 100, 24);

        Clothing tShirt = new Clothing("Gucci Shirt", 50, 102, "Cotton", "XL");

        myCart.addProduct(laptop);
        myCart.addProduct(tShirt);

        System.out.println("-----------------------------");

        double total = myCart.calculateTotalCost();
        System.out.println("Total price : " + total);
    }
}