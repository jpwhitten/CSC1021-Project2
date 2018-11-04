import java.util.Arrays;
import java.util.Scanner;

public class PizzaMenu {

	//Initialize a new global scanner instance
	public static Scanner s = new Scanner(System.in);
	
	//Main method calls the selectPizza method
	public static void main(String[] args) {
		selectPizza();
	}
	
	//Get user to select the pizza thay want from a list of predefined pizzas
	public static void selectPizza() {
		//Print out a prompt and the list of valid inputs
		System.out.println("Please select your pizza base: " + Arrays.toString(PredefinedPizzas.values()));
		//Enter while loop
		while(s.hasNext())
		{
			//Get user input (convert to uppercae to avoid any case errors in the input)
			String input = s.nextLine().toUpperCase();
			//try and catch statement to cover exception caused by invalid values
			try {
				//Tell the user what pizza they have selected
				System.out.println("You have selected " + PredefinedPizzas.valueOf(input).getName() + " as your pizza");
				//Print report for this pizza
				PredefinedPizzas.valueOf(input).getPizza().printReport();
				//Break the loop
				break;
			}
			catch(Exception e) {
				//If pizza is invalid then print an error message and ask for new input 
				System.out.println("Selected pizza does not exist, please select another pizza \nPizzas: "  + Arrays.toString(PredefinedPizzas.values()));
			}
		}
	}
}
