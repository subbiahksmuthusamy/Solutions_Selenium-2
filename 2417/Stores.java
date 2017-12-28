package htc.java.test1;

import java.util.List;
import java.util.ArrayList;

public class Stores {
	
	static List<Product> Prod = new ArrayList<Product>();
	
	Stores(Product P){
		
		Prod.add(P);
		
	}
	
	double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException, InsufficientQuantityException{
		double amount;
		if(Prod.contains(productCode)) {
			int Quantity;
			Product P1 = new Product();
			P1.getQuantityOnHand()
			Quantity = Prod.getClass(Product.this.getQuantityOnHand());
			Prod.
		}
		else {
			throw new ProductNotFoundException(productCode);
		}
		
		return qtyRequired;
		
	}
	
	public static void main(String[] args) {
	
	
	Prod.
	
	}

}
