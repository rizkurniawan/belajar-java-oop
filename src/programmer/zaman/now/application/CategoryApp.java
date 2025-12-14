package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID123");
        System.out.println(category.getId());
        category.setId(null);
        System.out.println(category.getId());
    }
}
