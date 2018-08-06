import java.util.Scanner;
public class landCalculation {

	//This code will tell you how many acres are in an entered number of square feet
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		Double entered;
		Double result;
		
		System.out.printf("Enter the number of square feet in you track of land (ex: 43560): ");
		entered = Double.parseDouble(keyboard.next());
		
		result = entered / 43560;
		
		System.out.printf("There are %.3f acres in your track of land", result);

	}

}
