package fil.iagl.opl.orders2;

import java.util.LinkedList;
import java.util.List;

public class Clients2 {
	
	private List<Client2> clients;
	
	public Clients2() {
		clients = new LinkedList<Client2>();
	}
	
	public List<Client2> getClients() {
		return clients;
	}
	
	public void addClient(Client2 c) {
		clients.add(c);
	}
	
	public void delClient(Client2 c) {
		if (c.hasOrders()) {
			return;
		}
		clients.remove(c);
	}

}
