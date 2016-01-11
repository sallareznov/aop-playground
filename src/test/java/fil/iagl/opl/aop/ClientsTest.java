package fil.iagl.opl.aop;

import org.junit.Assert;
import org.junit.Test;

import fil.iagl.opl.orders.CannotDeleteClientException;
import fil.iagl.opl.orders.Client;
import fil.iagl.opl.orders.Clients;
import fil.iagl.opl.orders.Order;

public class ClientsTest {

	@Test
	public void testAddClient() {
		final Clients clients = new Clients();
		Assert.assertEquals(0, clients.getClients().size());
		clients.addClient(new Client("Toto", "1 Rue des Fleurs"));
		Assert.assertEquals(1, clients.getClients().size());
	}

	@Test
	public void testDelClientThatDoesntHaveOrders() throws CannotDeleteClientException {
		final Clients clients = new Clients();
		final Client c1 = new Client("Toto", "1 Rue des Fleurs");
		clients.addClient(c1);
		Assert.assertEquals(1, clients.getClients().size());
		try {
			clients.delClient(c1);
		}
		catch (CannotDeleteClientException e) {
			Assert.fail("Cannot delete the order");
		}
		Assert.assertEquals(0, clients.getClients().size());
		
	}

	@Test(expected = CannotDeleteClientException.class)
	public void testDelClientThatAlreadyHasOrders() throws CannotDeleteClientException {
		final Clients clients = new Clients();
		final Client c1 = new Client("Toto", "1 Rue des Fleurs");
		Assert.assertEquals(0, clients.getClients().size());
		c1.addOrder(new Order(1, 1));
		clients.delClient(c1);
	}

}
