package sample;

public class StoreAssortment {
    private Supermarket[] supermarket;
    private int[] quantity;

    public StoreAssortment(Supermarket[] supermarket, int[] quantity) {
        this.supermarket = supermarket;
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

    public Supermarket[] getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(Supermarket[] supermarket) { this.supermarket = supermarket;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
}
