import java.util.Scanner;

public class ChapterFiveExtremes {
	public static void main(String...args) {

	int extremeSum = 0;
 	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
	int i = 1;

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("How many numbers you want to input: ");
	int inputAmount = keyboard.nextInt();

	System.out.println("Enter " + inputAmount + " numbers");

	 
	while( i <= inputAmount){
	System.out.println("Enter number" + i + ": ");
	int number = keyboard.nextInt(); 
	
	if(number > largest) largest = number;
	
	if(number < smallest) smallest = number;

	extremeSum = largest + smallest;
i++;
}
	System.out.println("Largest is: " + largest);
	System.out.println("Smallest is: " + smallest);
	System.out.println("Extreme sum is: " + extremeSum);


	}
}