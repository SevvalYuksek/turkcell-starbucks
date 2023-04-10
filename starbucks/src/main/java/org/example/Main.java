package org.example;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new EdevletServiceAdapter());
        Customer customer = new Customer("Sevval", "Yuksek", 2000, "12345");
        Customer customer2 = new Customer("Sevval", "Yuksek", 2000, "54321");
        customerManager.add(customer);
        customerManager.add(customer2);
    }
}