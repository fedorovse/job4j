package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 55);
        products[4] = new Product("Butter", 23);
        products[5] = new Product("sugar", 39);
        for (int index = 0; index < products.length; index++) {
            if (products[index] != null) {
                System.out.println(products[index].getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("");
        System.out.println("Delete element [2] - egg");
        Shop shop = new Shop();
        shop.delete(products, 2);
        for (int index = 0; index < products.length; index++) {
            if (products[index] != null) {
                System.out.println(products[index].getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
