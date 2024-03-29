package online_store;

public class Boots extends FootballShop implements DiscConsiderable
{
	private int size;

	// Constructors
	
	public Boots()
	{
		super();
	}
	public Boots(String brand, double price, int quantity, int size)
	{
		super(brand, price, quantity);
		this.size = size;
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
		System.out.println("BOOTS");
		System.out.println("Brand: " + getBrand());
		System.out.println("Size: " + size);
		System.out.println("Price: $" + getPrice());
		System.out.println("Discount: " + RATE * 100 + "%");
		System.out.println("Quantity: " + getQuantity());
		System.out.println("Subtotal: $" + calcDisc());
	}

	// Interface implementation
	public double calcDisc()
	{
		double total = getPrice() * getQuantity();
		double totalDisc = total - (RATE * total);
		return totalDisc;
	}
}
