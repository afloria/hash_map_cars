import java.util.HashMap;
import java.util.Scanner;
public class CarHash {

	public static void main(String[] args) {
		
		HashMap<String, String> availableCars = new HashMap<String, String>();
		// Add keys and values here(model, make)
		availableCars.put("Civic", "Honda");
		availableCars.put("Fit", "Honda");
		availableCars.put("Pilot", "Honda");
		availableCars.put("Corolla", "Toyota");
		availableCars.put("Yaris", "Toyota");
		availableCars.put("Prius", "Toyota");
		availableCars.put("Model-S", "Tesla");
		availableCars.put("Model-3", "Tesla");
		availableCars.put("Model-Y", "Tesla");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What model car are you looking for?");
		String userInput = scanner.next();
		
		String checkHash = availableCars.get(userInput);
		if(checkHash == null) {
			System.out.println("Sorry, we do not have that model in stock");
		} else {
			for (String i : availableCars.keySet()) {
				if(i.equals(userInput)) {
					System.out.println("Oh, you're looking for a " +userInput+ "? Our "
							+availableCars.get(i)+" selection is right over here...");
				}
			      
			}
		}
		

	}

}
