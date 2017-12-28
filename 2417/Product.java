package htc.java.test;

import java.util.Comparator;

public class Product implements Comparator<Product>{

	private int productId;
	private String productName;
	private double price;
	private int quantityOnHand;
	private int reorderLevel;
	private int reorderQty;
	
	Product(int productId, String productName, double price, int quantityOnHand, int reorderLevel, int reorderQty){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQty = reorderQty;
	}
	
	Product(){
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public int getReorderQty() {
		return reorderQty;
	}

	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", price=" + price + ", quantityOnHand="
				+ quantityOnHand + ", reorderLevel=" + reorderLevel
				+ ", reorderQty=" + reorderQty + "]";
	}

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
