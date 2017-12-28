package htc.java.test;

public class ProductNotFoundException extends Exception {

	int ProdID;
	
	ProductNotFoundException(int PID){
		this.ProdID=PID;
	}
	
	public String toString() {
	return "Product ID - " + this.ProdID + " NOT found\n";
	}
	
}

