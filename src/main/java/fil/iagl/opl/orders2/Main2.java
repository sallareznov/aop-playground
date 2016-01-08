package fil.iagl.opl.orders2;

public class Main2 {

	public static void main(String[] args) {
		final Clients2 clients = new Clients2();
		final Orders2 orders = new Orders2();
		
		
		// clients
		final Client2 client1 = new Client2("Client1", "Address1");
		final Client2 client2 = new Client2("Client2", "Address2");
		final Client2 client3 = new Client2("Client3", "Address3");
		
		// orders
		final Order2 order1 = new Order2(1, 4);
		final Order2 order2 = new Order2(2, 5);
		final Order2 order3 = new Order2(3, 6);
		final Order2 order4 = new Order2(4, 7);
		final Order2 order5 = new Order2(5, 8);
		final Order2 order6 = new Order2(6, 9);
		final Order2 order7 = new Order2(7, 10);
		final Order2 order8 = new Order2(8, 11);
		
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
		
		//client2.delOrder(o);
	}

}
