package sampleCC;

public class Product {
	long productId;
	int qtyOnHand;
	
	public Product(long productId, int qtyOnHand) {
		super();
		this.productId = productId;
		this.qtyOnHand = qtyOnHand;
	}

	public boolean purchase(int qty) {
		this.qtyOnHand=qty;
		return true;
	}
	
	public boolean sales(int qty) {
		if (this.qtyOnHand>=qty) {
			this.qtyOnHand-=qty;
			return true;
		}
		else {
			System.out.println("Insufficient Qty");
			return false;
		}
	}
}
