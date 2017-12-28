package htc.java.test1;

public class InsufficientQuantityException extends Exception {

	int ProdID;
	
	InsufficientQuantityException(int PID){
		this.ProdID=PID;
	}
	
	public String toString() {
	return "Product ID - " + this.ProdID + " has less Quantity\n";
	}
	
	
}
