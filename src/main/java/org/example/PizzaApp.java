package org.example;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza newPizza = new Pizza("BBQ","Avocado","Medium","palazo");
        System.out.println(newPizza.flavor);
    }
}