package fil.iagl.opl.orders;

public class Order {
	
	private int id;
	private double amount;
	
	public Order(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void printOrder() {
		System.out.println(id);
	}

}
