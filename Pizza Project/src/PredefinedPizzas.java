public enum PredefinedPizzas {
	
	//Initialize the pizzas as enums
	CHEESE("Cheese", PizzaBase.THINANDCRISPY, PizzaTopping.CHEESE),
	MEATS("Meats", PizzaBase.BBQ, PizzaTopping.BACON, PizzaTopping.PEPPERONI, PizzaTopping.GROUNDBEEF, PizzaTopping.HAM),
	VEGE("Vegetarian", PizzaBase.DEEPPAN, PizzaTopping.CHEESE, PizzaTopping.PEPPERS, PizzaTopping.MUSHROOMS)
	;
	
	//Declare private membervariables
	private String name;
	private Pizza pizza;
	
	//Constructor takes three parameters, pizza name and the arguments needed to create a pizza object
	PredefinedPizzas(String name, PizzaBase pizzaBase, PizzaTopping... pizzaToppings) {
		//Set the name of the pizza
		this.setName(name);
		//Create a new pizza object for each pizza enum
		Pizza pizza = new Pizza();
		//Set the pizza base for the pizza object using the pizza enum base as the parameter
		pizza.setPizzaBase(pizzaBase);
		//Add each index of the var args portion of the enum constructer to the pizzas topping list, by looping through the array
		for(PizzaTopping toppings : pizzaToppings) {
			pizza.addTopping(toppings);
		}
		//set the pizza for this enum
		this.setPizza(pizza);
	}

	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pizza getPizza() {
		return pizza;
	}
	
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
}
