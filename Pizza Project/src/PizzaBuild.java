
public class PizzaBuild {

	public static void main(String[] args) 
	{
		//Initialize new pizza object
		Pizza pizza = new Pizza(); 
		 //Set the base
		pizza.setPizzaBase(PizzaBase.DEEPPAN);
		 //Add a topping
		pizza.addTopping(PizzaTopping.BACON);
		//Add a topping
		pizza.addTopping(PizzaTopping.CHEESE); 
		//Add a topping
		pizza.addTopping(PizzaTopping.PEPPERONI); 
		//Print the report of the pizza
		pizza.printReport();
	}

}
