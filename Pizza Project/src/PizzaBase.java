public enum PizzaBase {

	//Initialize the pizza bases as enums
	DEEPPAN("Deep Pan", 1.50, true),
	STUFFEDCRUST("Stuffed Crust", 2.00, true),
	THINANDCRISPY("Thin And Crispy", 1.00, true),
	BBQ("BBQ", 2.0, false)
	;
	
	//Declare the private member variables
	private String baseName;
	private double cost;
	private boolean vegetarian;
	
	//PizzaBase constructor takes the private variables as parameters
	PizzaBase(String baseName, double cost, boolean vegetarian) 
	{
		this.setBaseName(baseName);
		this.setCost(cost);
		this.setVegetarian(vegetarian);
	}

	//Getter and Setter methods
	public String getBaseName() 
	{
		return baseName;
	}

	public void setBaseName(String baseName)
	{
		this.baseName = baseName;
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
