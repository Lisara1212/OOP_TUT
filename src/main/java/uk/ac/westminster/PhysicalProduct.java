package uk.ac.westminster;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {

    }
    public PhysicalProduct(Long id , String name, double price, String dimensions, double weightkg) {
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;

    }
    public double getWeightKg() {
        return weightKg;

    }
    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }




    @Override
    public String getSummary(){
        return "Physical :" + getName() + "| Weight : " + getWeightKg();
    }
    @Override
    public void applyDiscountedPrice(double rate){
        double cappedRate = Math.min(rate,0.20);
        this.discountedPrice =getPrice()*(1-cappedRate);
    }

    @Override
    public void applyDiscount(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

}
