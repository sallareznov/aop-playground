package fil.iagl.opl.orders2;

public class Order2 {
	
	private int id;
	private double amount;
	private Client2 client;
	
	public Order2(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public Client2 getClient() {
		return client;
	}
	
	public void setClient(Client2 c) {
		this.client = c;
	}
	
	public void printOrder() {
		System.out.println(id);
	}

}
