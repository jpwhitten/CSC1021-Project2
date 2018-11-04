
public enum PizzaTopping {

	//Initialize the pizza toppings as enums
	PEPPERONI("Pepperoni", 1.0, false),
	HAM("Ham", 1.0, false),
	GROUNDBEEF("Ground beef", 1.0,  false),
	BACON("Bacon", 1.0, false),
	CHEESE("Cheese", 1.0, true),
	PEPPERS("Peppers", 1.0, true),
	MUSHROOMS("Mushrooms", 1.0, true)
	;
	
	//Declare the private member variables
	private String toppingName;
	private double cost;
	private boolean vegetarian;
	
	//PizzaTopping constructor takes the private variables as parameters
	PizzaTopping(String toppingName, double cost, boolean vegetarian) 
	{
		this.setToppingName(toppingName);
		this.setCost(cost);
		this.setVegetarian(vegetarian);
	}

	//Getter and Setter methods
	public String getToppingName() 
	{
		return toppingName;
	}

	public void setToppingName(String toppingName) 
	{
		this.toppingName = toppingName;
	}

	public double getCost() 
	{
		return cost;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	public boolean isVegetarian() 
	{
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) 
	{
		this.vegetarian = vegetarian;
	}
	
	
}
