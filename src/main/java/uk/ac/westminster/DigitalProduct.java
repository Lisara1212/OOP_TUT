package uk.ac.westminster;

import org.springframework.context.ApplicationListener;

public class DigitalProduct extends Product implements Discountable{
    private String downloadUrl;
    private double filesizeMB;

    public DigitalProduct() {

    }
    public DigitalProduct(Long id,String name ,double price,String downloadUrl,double filesizeMB){
        super(id,name,price);
        this.downloadUrl = downloadUrl;
        this.filesizeMB = filesizeMB;
    }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    public double getFilesizeMB() {
        return filesizeMB;
    }
    public void setFilesizeMB(double filesizeMB) {
        this.filesizeMB = filesizeMB;
    }

    @Override
    public String getSummary(){
        return "Digital : " + getName() + "| Download : " + downloadUrl;
    }

    @Override
    public void applyDiscountedPrice(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }


    @Override
    public void applyDiscount(double rate) {

    }
}


