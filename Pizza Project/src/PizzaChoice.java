import java.util.Arrays;
import java.util.Scanner;

public class PizzaChoice {

	//Initialize a new global scanner instance
	public static Scanner s = new Scanner(System.in); 
	
	//Main method initializes a new pizza and calls the input methods to get the propertys of the pizza from the user (Pizza base and toppings)
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		inputBase(pizza);
		inputToppings(pizza);
		//Print a report for this pizza
		pizza.printReport();
	}

	//Get user to input the base of the pizza (Takes current pizza in question as an input)
	public static void inputBase(Pizza pizza) {
		//Print out a prompt and the list of valid inputs
		System.out.println("Please select your pizza base: " + Arrays.toString(PizzaBase.values()));
		//Enter while loop
		while(s.hasNext())
		{
			//Get user input (convert to uppercae to avoid any case errors in the input)
			String input = s.nextLine().toUpperCase();
			//try and catch statement to cover exception caused by invalid values
			try {
				//Set the pizza base as the selected input
				pizza.setPizzaBase(PizzaBase.valueOf(input));
				//Let user know what they have selected
				System.out.println("You have selected " + PizzaBase.valueOf(input).getBaseName() + " as your pizza base");
				//break the loop as pizza can only have one base
				break;
			}
			catch(Exception e) {
				//If base is invalid then print an error message and ask for new input 
				System.out.println("Selected base does not exist, please select another base" + Arrays.toString(PizzaBase.values()));
			}
		}
	}
	
	//get a user to input the toppings of the pizza (Takes current pizza in question as an input)
	public static void inputToppings(Pizza pizza) {
		//Print out a prompt and the list of valid inputs
		System.out.println("Please select your pizza toppings enter \"end\" when you have finished selecting: " + Arrays.toString(PizzaTopping.values()));
		//Enter while loop
		while(s.hasNext())
		{
			//Get user input (convert to uppercae to avoid any case errors in the input)
			String input = s.nextLine().toUpperCase();
			//try and catch statement to cover exception caused by invalid values
			try {
				//Check to see if the input is "end" in which case the selection is complete and will break the for loop
				if(input.toLowerCase().equals("end")) {
					System.out.println("Selection complete");
					break;
				}
				//Add the topping to the pizza
				pizza.addTopping(PizzaTopping.valueOf(input));
				//Let the user know what they have selected
				System.out.println("You have selected " + PizzaTopping.valueOf(input).getToppingName() + "\nToppings: " + Arrays.toString(PizzaTopping.values()));
			}
			catch(Exception e) {
				//If topping is invalid then print an error message and ask for new input
				System.out.println("Selected topping does not exist, please select another topping or enter \"done\" \nToppings: " + Arrays.toString(PizzaTopping.values()));
			}
		}
	}
}
