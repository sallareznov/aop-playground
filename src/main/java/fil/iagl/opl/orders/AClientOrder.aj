package fil.iagl.opl.orders;

import java.util.LinkedList;
import java.util.List;

public aspect AClientOrder {
	
	private List<Order> Client.orders = new LinkedList<Order>();
	private Client Order.client;
	
	public List<Order> Client.getOrders() {
		return orders;
	}
	
	public void Client.addOrder(Order o) {
		orders.add(o);
	}
	
	public boolean Client.hasOrders() {
		return !orders.isEmpty();
	}
	
	public void Client.delOrder(Order o) {
		orders.remove(o);
	}
	
	public Client Order.getClient() {
		return client;
	}
	
	public void Order.setClient(Client c) {
		this.client = c;
	}
	
	pointcut constraintRemoveOrder(Client clientToRemove): call(void Clients.delClient(Client)) && args(clientToRemove);
	
	void around(Client clientToRemove) throws CannotDeleteClientException: constraintRemoveOrder(clientToRemove) {
		if (!clientToRemove.orders.isEmpty()) {
			throw new CannotDeleteClientException();
		}
		proceed(clientToRemove);
	}
	
}
