package fil.iagl.opl.orders;

public class Main {

	public static void main(String[] args) throws CannotDeleteClientException {
		final Clients clients = new Clients();
		final Orders orders = new Orders();
		
		
		// clients
		final Client client1 = new Client("Client1", "Address1");
		final Client client2 = new Client("Client2", "Address2");
		final Client client3 = new Client("Client3", "Address3");
		
		// orders
		final Order order1 = new Order(1, 4);
		final Order order2 = new Order(2, 5);
		final Order order3 = new Order(3, 6);
		final Order order4 = new Order(4, 7);
		final Order order5 = new Order(5, 8);
		final Order order6 = new Order(6, 9);
		final Order order7 = new Order(7, 10);
		final Order order8 = new Order(8, 11);
		
		clients.addClient(client1);
		clients.addClient(client2);
		clients.addClient(client3);
		
		orders.addOrder(order1);
		orders.addOrder(order2);
		orders.addOrder(order3);
		orders.addOrder(order4);
		orders.addOrder(order5);
		orders.addOrder(order6);
		orders.addOrder(order7);
		orders.addOrder(order8);
		
		client1.addOrder(order8);
		client2.addOrder(order7);
		client3.addOrder(order6);
		client1.addOrder(order3);
		client2.addOrder(order4);
		client3.addOrder(order5);
		client1.addOrder(order2);
		client3.addOrder(order1);
		
		System.out.println("--> Beginning");
		System.out.println(clients.getClients().size() + " clients and " + orders.getOrders().size() + " orders.");
		
		clients.getClients().forEach(client -> {
			System.out.println(client.getName() + " has " + client.getOrders().size() + " order(s).");
			client.getOrders().forEach(order -> {
				System.out.print(" - ");
				order.printOrder();
			});
		});
		
		clients.delClient(client1);
	}

}
