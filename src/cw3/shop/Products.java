package cw3.shop;

public class Products {

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private int piecesAvailable = quantity;
    private Storage storage;
    private int deliveryTime = 0;

    public Products(String name, ProductType type, double price, int quantity) {
        setName(name);
        setProductType(type);
        setPrice(price);
        setQuantity(quantity);
    }

    public Products(String name, ProductType type, double price, int quantity, Storage storage) {
        setName(name);
        setProductType(type);
        setPrice(price);
        setQuantity(quantity);
        setStorage(storage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty.");
        }
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        if (productType == null) {
            throw new RuntimeException("Product type must be specified.");
        }
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Price must be higher than 0. ");
        }
        this.price = price;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        if (storage == null) {
            throw new RuntimeException("Storage must be specified.");
        }
        this.storage = storage;
        this.setDeliveryTime(this.storage.getDeliveryTime());
        storage.setStoredProducts(this);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public boolean isAvailable() {
        if (this.piecesAvailable > 0 && this.quantity > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("Product quantity must be higher than 0.");
        }
        this.quantity = quantity;
        this.piecesAvailable = quantity;
    }

    public int getPiecesAvailable() {
        return piecesAvailable;
    }

    public void setPiecesAvailable(int piecesAvailable) {
        this.piecesAvailable = piecesAvailable;
    }

    public void increasePiecesAvailable() {
        this.piecesAvailable++;
    }

    public void decreasePiecesAvailable() {
        this.piecesAvailable--;
    }

    public void Sell() {
        if (isAvailable()) {
            this.quantity--;
        }
    }

    public void IncreaseQuantity(int quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("Increase value must be higher than 0.");
        }
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + getName() + '\'' +
                ", productType=" + getProductType() +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                ", piecesAvailable=" + getPiecesAvailable() +
                ", storage=" + getStorage() +
                ", deliveryTime=" + getDeliveryTime() +
                '}';
    }
}

