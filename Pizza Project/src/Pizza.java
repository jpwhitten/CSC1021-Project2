import java.util.ArrayList;
import java.util.List;

public class Pizza {

	//Declare private member variables, base of the pizza and a list of toppings
	private PizzaBase pizzaBase;
	private List<PizzaTopping> pizzaToppings = new ArrayList<PizzaTopping>();
	
	//Pizza constructor takes no parameters
	Pizza() 
	{
		
	}

	//Getter and setter methods
	public PizzaBase getPizzaBase() 
	{
		return pizzaBase;
	}

	public void setPizzaBase(PizzaBase pizzaBase) 
	{
		this.pizzaBase = pizzaBase;
	}

	public List<PizzaTopping> getPizzaToppings() 
	{
		return pizzaToppings;
	}

	public void setPizzaToppings(List<PizzaTopping> pizzaToppings) 
	{
		this.pizzaToppings = pizzaToppings;
	}
	
	public void addTopping(PizzaTopping pizzaTopping)
	{
		this.getPizzaToppings().add(pizzaTopping);
	}
	
	//Calculate the cost of the pizza
	public double calculateCost() 
	{
		//Initialize cost equal to 0
		double cost = 0; 
		//loop through the list of all the stored toppings for this pizza
		for(PizzaTopping topping : this.getPizzaToppings())
		{
			//Sum the cost of the toppings
			cost += topping.getCost(); 
		}
		//Add the cost of the base to the total
		cost += this.getPizzaBase().getCost();
		//return the sum
		return cost;
	}
	
	//Calculate if the pizza is suitable for vegetarians
	public boolean isVegetarian() 
	{
		//loop through all of the stored toppings for this pizza
		for(PizzaTopping topping : this.getPizzaToppings()) 
		{
			//Check if the toppings are suitable for vegetarians
			if(!topping.isVegetarian())
			{
				return false;
			}
		}
		//Check if base is suitable for vegetarians
		if(!this.getPizzaBase().isVegetarian())
		{
			//if it isn't return false
			return false;
		}
		//If all components of the pizza are suitable for vegetarians return true 
		return true;
	}
	
	//Format the base report
	public String formatBaseReport() 
	{
		return String.format("%-15s\t£%-5s", this.getPizzaBase().getBaseName(), this.getPizzaBase().getCost());
	}
	
	//Format the topping report
	public String formatToppingsReport(int i) 
	{
		return String.format("%-15s\t£%-5s", this.getPizzaToppings().get(i).getToppingName(), this.getPizzaToppings().get(i).getCost());
	}
	
	//Print the report for this pizza           
	public void printReport() {
		System.out.println("This Pizza:"); 
		//Format the columns for the base portion of the report
		System.out.printf("%-15s\t%-5s\n", "Pizza Base", "Cost");
		System.out.println(this.formatBaseReport());
		//Format the columns for the base portion of the report
		System.out.printf("%-15s\t%-5s\n", "Pizza Topping", "Cost");
		//For each topping on the pizza print its respective line of the report
		for(int i = 0; i < pizzaToppings.size(); i++) {
			System.out.println(this.formatToppingsReport(i));
		}
		//Print if the pizza is suitable for vegetarians
		System.out.println("Suitable for vegetarians: " + this.isVegetarian());
		//Print the total cost of the pizza
		System.out.println("Total Cost: £" + this.calculateCost());
	}
	
}
