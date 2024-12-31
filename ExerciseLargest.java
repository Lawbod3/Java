import java.util.Scanner;

public class TaxCalculator {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);

	int largest = Integer.MIN_VALUE;
	int number = 0;

	for(int count = 1; count <= 10; count++){
	System.out.println("Enter a number: ");
	number = keyboard.nextInt();

	if(number > largest) largest = number;

}

	System.out.println("Largest number is: " + largest);	

	}
}