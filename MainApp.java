package com.training.Day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        Customer cust1 = new Customer(1L, "Stefan Walker", 1);
        Customer cust2 = new Customer(2L, "Daija Von", 1);
        Customer cust3 = new Customer(3L, "Ariane Rodriguez", 1);
        Customer cust4 = new Customer(4L, "Marques Nikolaus", 2);
        Customer cust5 = new Customer(5L, "Rachelle Greenfelder", 0);
        Customer cust6 = new Customer(6L, "Larissa White", 2);
        Customer cust7 = new Customer(7L, "Fae Heidenreich", 1);
        Customer cust8 = new Customer(8L, "Dino Will", 2);
        Customer cust9 = new Customer(9L, "Eloy Stroman", 1);
        Customer cust10 = new Customer(10L, "Brisa O''Connell", 1);

        Product prod1 = new Product(1L, "omnis quod consequatur", "Games", 184.83);
        Product prod2 = new Product(2L, "vel libero suscipit", "Toys", 12.66);
        Product prod3 = new Product(3L, "non nemo iure", "Grocery", 498.02);
        Product prod4 = new Product(4L, "voluptatem voluptas aspernatur", "Toys", 536.80);
        Product prod5 = new Product(5L, "animi cum rem", "Games", 458.20);
        Product prod6 = new Product(6L, "dolorem porro debitis", "Toys", 146.52);
        Product prod7 = new Product(7L, "aspernatur rerum qui", "Books", 656.42);
        Product prod8 = new Product(8L, "deleniti earum et", "Baby", 41.46);
        Product prod9 = new Product(9L, "voluptas ut quidem", "Books", 697.57);
        Product prod10 = new Product(10L, "eos sed debitis", "Baby", 366.90);

        ArrayList<Customer> cust = new ArrayList<Customer>();
        cust.add(cust1);
        cust.add(cust2);
        cust.add(cust3);
        cust.add(cust4);
        cust.add(cust5);
        cust.add(cust6);
        cust.add(cust7);
        cust.add(cust8);
        cust.add(cust9);
        cust.add(cust10);

        ArrayList<Product> product = new ArrayList<Product>();
        product.add(prod1);
        product.add(prod2);
        product.add(prod3);
        product.add(prod4);
        product.add(prod5);
        product.add(prod6);
        product.add(prod7);
        product.add(prod8);
        product.add(prod9);
        product.add(prod10);

        Order order1 = new Order(1L, "New", "2021-01-23", "2021-02-12", product, cust1);
        Order order2 = new Order(2L, "delivered", "2021-01-23", "2021-02-12", product, cust2);
        Order order3 = new Order(3L, "New", "2021-01-23", "2021-02-12", product, cust3);
        Order order4 = new Order(4L, "pending", "2021-01-23", "2021-02-12", product, cust4);
        Order order5 = new Order(5L, "New", "2021-01-23", "2021-02-12", product, cust5);
        Order order6 = new Order(6L, "delivered", "2021-01-23", "2021-02-12", product, cust6);
        ArrayList<Order> orders = new ArrayList<Order>();

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);


        System.out.println("****Book Category with price>100******");
        product.stream().filter(p -> p.getCategory().equals("Books")).filter(p -> p.getPrice() > 100).forEach(System.out::println);

        System.out.println("*****list of orders with product belong to category Baby**** ");
        orders.stream().filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby"))).collect(Collectors.toList()).forEach(System.out::println);

        //orders.stream().filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby"))).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*****Toys Category with 10% discount******");
        product.stream().filter(p -> p.getCategory().equals("Toys")).map(p -> p.getPrice() * 0.9).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("*****cheapest product of Book category****");
        System.out.println(product.stream().filter(p -> p.getCategory().equals("Books")).sorted(Comparator.comparing(Product::getPrice)).findFirst());


    }
}
