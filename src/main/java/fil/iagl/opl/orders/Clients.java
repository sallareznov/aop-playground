package fil.iagl.opl.orders;

import java.util.LinkedList;
import java.util.List;

public class Clients {
	
	private List<Client> clients;
	
	public Clients() {
		clients = new LinkedList<Client>();
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void addClient(Client c) {
		clients.add(c);
	}
	
	public void delClient(Client c) throws CannotDeleteClientException {
		clients.remove(c);
	}

}
