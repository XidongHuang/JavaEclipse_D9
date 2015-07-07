package tony.exe1.java;

public class TestOrder {
	public static void main(String[] args) {
		Order o1 = new Order();
		System.out.println(o1);
	}
}


class Order{
	private int orderId;
	private String orderName;
	
	public Order(){
		
	}
	
	{
		orderId = 1002;
		orderName = "AA";
		System.out.println("I am...");
	}
	
	{
		System.out.println("I am... 2");
	}
	
	static{
		System.out.println("I am...3");
	}
	
	
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	
	
}