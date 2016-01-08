package fil.iagl.opl.orders;

import java.util.LinkedList;
import java.util.List;

public class Orders {
	
	private List<Order> orders;
	
	public Orders() {
		orders = new LinkedList<Order>();
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public void delOrder(Order o) {
		orders.remove(o);
	}
	
}
