package programmer.zaman.now.data;

import java.util.Objects;

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

    public final boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;

        return price == product.price && Objects.equals(name, product.name);
    }
}
