package uk.ac.westminster;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

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





}
