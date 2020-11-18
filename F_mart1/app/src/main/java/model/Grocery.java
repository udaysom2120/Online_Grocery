package model;

public class Grocery {
    public int productImage;
    public String productName;
    public String productDescription;
    public String productWeight;
    public String productQty;

    public Grocery(String productName, int productImage,String productDescription) {
        this.productImage = productImage;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productWeight = productWeight;
        this.productQty = productQty;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
