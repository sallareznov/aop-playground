package fil.iagl.opl.orders;

public class Client {
	
	private String name;
	private String address;
	
	public Client(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
}
