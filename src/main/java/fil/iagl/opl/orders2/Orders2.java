package fil.iagl.opl.orders2;

import java.util.LinkedList;
import java.util.List;

public class Orders2 {
	
	private List<Order2> orders;
	
	public Orders2() {
		orders = new LinkedList<Order2>();
	}
	
	public List<Order2> getOrders() {
		return orders;
	}
	
	public void addOrder(Order2 o) {
		orders.add(o);
	}
	
	public void delOrder(Order2 o) {
		orders.remove(o);
	}
	
}
