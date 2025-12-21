package programmer.zaman.now.data;

public class Product {
    public String name;
    public int price;

     public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // OVERIDE DEFAULT TO STRING
    public String toString() {
         return "Nama produk: " + name + ". Price: " + price;
    }
}
