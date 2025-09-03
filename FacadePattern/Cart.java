public class Cart implements HotelService{
    int numberOfCarts;

    Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void executeService() {
        requestCart();
    }

    private void requestCart() {
        System.out.println("Cart service is handling request for " + numberOfCarts + " carts");
    }
}
