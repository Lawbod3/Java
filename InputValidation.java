import java.util.Scanner;

public class InputValidation {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);
	
	int input = 0;
	int i = 1;

	while( i <= 5){
	System.out.println("Enter either 1 or 2: ");
	input = keyboard.nextInt();
					

	if(input == 1 || input == 2)i++;
else{ System.out.println("Please enter Correct input");}

	}



	}
}