package chapter3;

public class PetrolPurchases {
    private String location;
    private String Petrol;
    private int quantity;
    private double pricePerLiters;
    private double percentagesDiscount;

    public PetrolPurchases(String location, String petrol, int quantity, double pricePerLiters, double percentagesDiscount) {
        this.location = location;
        Petrol = petrol;
        this.quantity = quantity;
        this.pricePerLiters = pricePerLiters;
        this.percentagesDiscount = percentagesDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrol() {
        return Petrol;
    }

    public void setPetrol(String petrol) {
        Petrol = petrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiters() {
        return pricePerLiters;
    }

    public void setPricePerLiters(double pricePerLiters) {
        this.pricePerLiters = pricePerLiters;
    }

    public double getPercentagesDiscount() {
        return percentagesDiscount;
    }

    public void setPercentagesDiscount(double percentagesDiscount) {
        this.percentagesDiscount = percentagesDiscount;
    }

    public double getPurchasesAmount() {
        double netPurchases = (quantity * pricePerLiters) - percentagesDiscount;
        return netPurchases;
    }
}
