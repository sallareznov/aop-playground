package fil.iagl.opl.aop;

import org.junit.Assert;
import org.junit.Test;

import fil.iagl.opl.orders.Order;
import fil.iagl.opl.orders.Orders;

public class OrdersTest {
	
	@Test
	public void testAddOrder() {
		final Orders orders = new Orders();
		Assert.assertEquals(0, orders.getOrders().size());
		orders.addOrder(new Order(1, 1));
		Assert.assertEquals(1, orders.getOrders().size());
	}
	
	@Test
	public void testDelOrder() {
		final Orders orders = new Orders();
		final Order o1 = new Order(1, 1);
		final Order o2 = new Order(2, 1);
		final Order o3 = new Order(3, 1);
		final Order o4 = new Order(4, 1);
		orders.addOrder(o1);
		orders.addOrder(o2);
		orders.addOrder(o3);
		orders.addOrder(o4);
		Assert.assertEquals(4, orders.getOrders().size());
		orders.delOrder(o3);
		Assert.assertEquals(3, orders.getOrders().size());
	}

}
