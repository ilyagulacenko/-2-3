package async;

public class StoreAssortment {
    private Supermarket[] supermarkets;
    private int[] quantity;

    public StoreAssortment(Supermarket[] supermarkets, int[] quantity) {
        this.supermarkets = supermarkets;
        this.quantity = quantity;
    }

    public StoreAssortment() {
    }

    public void setQuantityFromIndex(int index, int value) {
        try {
            quantity[index] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Supermarket[] getSupermarkets() {
        return supermarkets;
    }

    public void setSupermarkets(Supermarket[] supermarkets) {
        this.supermarkets = supermarkets;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
}
