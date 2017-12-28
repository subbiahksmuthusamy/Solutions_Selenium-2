package htc.java.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Stores{
	
	ArrayList<Product> ProdList = new ArrayList<Product>();
	
	void addProducts(Product P){
		
		ProdList.add(P);
		
	}
	
	double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException, InsufficientQuantityException{
		double amount = 0.00;
		int Quantity = 0;
		boolean ProdFound = false;
		boolean QuanLess = false;
		Iterator<Product> itr=ProdList.iterator();
	
		while(itr.hasNext()){
			Product P1 = (Product)itr.next();
			if (productCode == P1.getProductId()){
				ProdFound = true;
				if (qtyRequired < P1.getQuantityOnHand()){
					amount = qtyRequired * P1.getPrice();
					Quantity = P1.getQuantityOnHand() - qtyRequired;
					P1.setQuantityOnHand(Quantity);
					if (Quantity <= P1.getReorderLevel()){
						System.out.println("Purchase Order is Made for Product Code - " + productCode);
					}
					System.out.println("Quantity in Hand is - " + Quantity);
		//			System.out.println("Product code available");
					break;
				}
				else{
					QuanLess = true;
					break;
				}
			}			
		}
		if (!ProdFound){
			throw new ProductNotFoundException(productCode);
		}
		if (QuanLess){
			throw new InsufficientQuantityException(productCode);
		}
		return amount;
	}
	
	void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException{
		int Quantity = 0;
		boolean ProdFound = false;
		Iterator<Product> itr=ProdList.iterator();
		while(itr.hasNext()){
			Product P1 = (Product)itr.next();
			if (productCode == P1.getProductId()){
				Quantity = P1.getQuantityOnHand() + arrivedQty;
				P1.setQuantityOnHand(Quantity);
				System.out.println("Updated Product stock: \n" + P1.toString());
				ProdFound = true;
				break;
			}
		}
		if (!ProdFound){
			throw new ProductNotFoundException(productCode);
		}
	}
	
	void readAll(){
		 Iterator<Product> itr1=ProdList.iterator();  
		  while(itr1.hasNext()){  
			  Product P1 = (Product)itr1.next();
			  System.out.println("Product ID - " + P1.getProductId() + " ;Product Name - " + P1.getProductName() + 
					  " ;Quantity available - " + P1.getQuantityOnHand());  
		  }  
	}
	
	void SortbyPrice(){
		PriceCompare priceCompare = new PriceCompare();
        Collections.sort(ProdList, priceCompare);
        for (Product Prod: ProdList)
            System.out.println(Prod.getPrice() + " " +
                               Prod.getProductId() + " " +
                               Prod.getProductName());
	}
	
	
	public static void main(String[] args) throws ProductNotFoundException, InsufficientQuantityException {
		
		int PCode = 0;
		int QuanReq = 0;
		double TotAmount;
		Product Prod1 = new Product(101,"Horlicks",450.00,25,10,50);
		Product Prod2 = new Product(105,"Boost",350.00,35,10,50);
		Product Prod3 = new Product(103,"Rice bag",1150.00,55,10,50);
		Product Prod4 = new Product(201,"Bournvita",650.00,45,10,50);
		
		Stores store1 = new Stores();
		store1.addProducts(Prod1);
		store1.addProducts(Prod2);
		store1.addProducts(Prod3);
		store1.addProducts(Prod4);
		
		store1.readAll();
		
		System.out.println("Enter the Product Code: \n");
		Scanner in1 = new Scanner(System.in);
		try{
			PCode = in1.nextInt();
		}catch (NumberFormatException ne){
			System.out.println(" Enter an valid Operation");
		}
		
		System.out.println("Quantity Required: \n");
		Scanner in2 = new Scanner(System.in);
		try{
			QuanReq = in2.nextInt();
		}catch 	(NumberFormatException ne){
			System.out.println(" Enter an valid Operation");
		}
		
		TotAmount = store1.sellItem(PCode, QuanReq);
		
		store1.updateStock(103, 45);
//		store1.updateStock(105, 20);
		
				
		System.out.println("Your Total Bill amount is - " + TotAmount);
		
		System.out.println("\n Products Sorted by Price --------\n");
	//	Sort by Price
		store1.SortbyPrice();
		
		
		in1.close();
		in2.close();
	}

}