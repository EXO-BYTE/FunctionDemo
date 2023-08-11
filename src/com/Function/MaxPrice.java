package com.Function;
import java.util.*;
import java.util.function.BinaryOperator;

public class MaxPrice {
	public static void main(String[] args) {
	       Item item1 = new Item("Milk", 25);
	       Item item2 = new Item("Coffee", 15);


	        BinaryOperator<Item> maxPriceItem = BinaryOperator.maxBy((itemA, itemB) -> Double.compare(itemA.getPrice(), itemB.getPrice()));

	        Item itemWithMaxPrice = maxPriceItem.apply(item1, item2);

	        System.out.println("Item with max price: " + itemWithMaxPrice.getName());
	    }
	}
