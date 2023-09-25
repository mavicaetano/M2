package m2s02.exercicio4;

public class Fatura {

    private String number;
    private String description;
    private int quantity;
    private double priceForItem;

    public String getNumber() {
        return number;
    }

    public Fatura (String number, String description, int quantity, double priceForItem) {
        this.number = number;
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (priceForItem > 0) {
            this.priceForItem = priceForItem;
        } else {
            this.priceForItem = 0.0;
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceForItem() {
        return priceForItem;
    }

    public void setPriceForItem(double priceForItem) {
        this.priceForItem = priceForItem;
    }

    public double getValorFatura() {
        return priceForItem * quantity;
    }
}
