package online_store;
import java.util.ArrayList;

public class Customer
{
	private String custName;
	private ArrayList<FootballShop> itemList = new ArrayList<>();
	private int numOfItems;
	private double totalPay;
	
	// Constructor

	public Customer(String custName)
	{
		this.custName = custName;
	}

	// Getters
	
	public String getCustName()
	{
		return custName;
	}
	public ArrayList<FootballShop> getItemList()
	{
		return itemList;
	}
	public int getNumOfItems()
	{
		return numOfItems;
	}
	public double getTotalPay()
	{
		return totalPay;
	}
	
	// Class Methods
	
	public void buy(FootballShop item)		// Perform a purchase
	{
		numOfItems++;
		itemList.add(item);
		totalPay += item.getPrice();
	}
	public void print()		// Display the total cost of all items
	{
		System.out.println("TOTAL: $" + totalPay);
	}
	public void invoice()	// Display all items 
	{
		int counter = 1;
		System.out.println("Welcome " + custName + "!");
		System.out.println("");
		System.out.println("List of Football Items Bought");
		System.out.println("");
		for(FootballShop item : itemList)
		{
			System.out.println("Item " + counter);
			item.display();
			System.out.println("");
			counter++;
		}
		print();
	}
}
