package fil.iagl.opl.orders2;

import java.util.LinkedList;
import java.util.List;

public class Client2 {
	
	private String name;
	private String address;
	private List<Order2> orders;
	
	public Client2(String name, String address) {
		this.name = name;
		this.address = address;
		orders = new LinkedList<Order2>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public List<Order2> getOrders() {
		return orders;
	}
	
	public void addOrder(Order2 o) {
		orders.add(o);
	}
	
	public boolean hasOrders() {
		return !orders.isEmpty();
	}
	
	public void delOrder(Order2 o) {
		orders.remove(o);
	}
	
}
