import java.io.Serializable;

public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    private static int id_Product = 0;
    private String name_Product;
    private String make;
    private int price;
    private String decription;
    public Product(){

    }
    public Product(int id_Product, String name_Product, String make, int price, String decription) {
        this.id_Product = id_Product;
        this.name_Product = name_Product;
        this.make = make;
        this.price = price;
        this.decription = decription;
    }

    public int getId_Product() {
        return Product.id_Product;
    }

    public void setId_Product() {
        id_Product++;
    }

    public String getName_Product() {
        return name_Product;
    }

    public void setName_Product(String name_Product) {
        this.name_Product = name_Product;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name_Product='" + name_Product + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", decription='" + decription + '\'' +
                '}';
    }
}
