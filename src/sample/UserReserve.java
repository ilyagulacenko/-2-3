package sample;


public class UserReserve {
    private Supermarket supermarket;
    private int quantity;
    private double totalAmount;

    public UserReserve() {
        this.supermarket = new Supermarket();
        this.quantity = 0;
        this.totalAmount = 0;
    }

    public UserReserve(Supermarket supermarket, int quantity) {
        this.supermarket = supermarket;
        this.quantity = quantity;
        this.totalAmount = supermarket.getPrice() * quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Supermarket getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
