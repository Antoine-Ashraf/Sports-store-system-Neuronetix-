package online_store;

public class Application
{
	public static void main(String[] args)
	{
		FootballShop p1 = new SoccerBall("Adidas", 29.00, 2, "Indoor");
		FootballShop p2 = new Boots("Nike", 59.00, 1, 42);
		Customer c1 = new Customer("Antoine Ashraf");
		
		c1.buy(p1);
		c1.buy(p2);
		c1.invoice();
	}

}
