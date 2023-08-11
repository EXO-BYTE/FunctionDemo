package com.Function;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class Store {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alex", "BANGLORE", 500.0f));
        customers.add(new Customer("Ava", "MYSORE", 250.0f));
        customers.add(new Customer("Stella", "PUNE", 110.0f));

        
        customers.sort(Comparator.comparingDouble(Customer::getPlanAmount));

        
        Predicate<Customer> filter = customer -> customer.getPlanAmount() >= 200.0f;
        customers.removeIf(filter.negate());

        
        for (Customer customer : customers) {
            System.out.println(customer.customerName + " - " + customer.planAmount);
        }
    }
}
