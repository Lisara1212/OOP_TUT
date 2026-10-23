package uk.ac.westminster;

public class DigitalProduct extends Product {
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



}


