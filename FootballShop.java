package online_store;

public abstract class FootballShop
{
	private String brand;
	private double price;
	private int quantity;
	
	// Constructors
	
	public FootballShop() {}
	public FootballShop(String brand, double price, int quantity)
	{
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Setters & Getters
	
	public void setPrice(double price)
	{
		this.price = price;
	}	
	public double getPrice()
	{
		return price;
	}
	public String getBrand()
	{
		return brand;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	// Abstract Methods
	
	public abstract void display();
	public abstract double calcPrice();
}