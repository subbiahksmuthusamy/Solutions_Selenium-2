package htc.java.test;

import java.util.Comparator;

public class PriceCompare implements Comparator<Product>{
	
	public int compare(Product p1, Product p2)
	 {		
		return (int)(p1.getPrice() - p2.getPrice()); 
	 }

}
