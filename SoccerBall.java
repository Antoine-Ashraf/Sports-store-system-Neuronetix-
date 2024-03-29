package online_store;

public class SoccerBall extends FootballShop
{
	private String ballType;

	// Constructor
	
	public SoccerBall(String brand, double price, int quantity, String ballType)
	{
		super(brand, price, quantity);
		this.ballType = ballType;
	}
	
	// Abstract Methods Implementation
	
	public double calcPrice()
	{
		double total;
		total = getPrice() * getQuantity();
		return total;
	}
	public void display()
	{
		System.out.println("SOCCER BALL");
		System.out.println("Brand: " + getBrand());
		System.out.println("Type: " + ballType);
		System.out.println("Price: $" + getPrice());
		System.out.println("No Discount!");
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Subtotal: $" + getPrice()*getQuantity());
	}
}