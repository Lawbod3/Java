import java.util.Scanner;

public class ChapterFiveExtremes {
	public static void main(String...args) {

	int sum = 0;
 	int largest = 0;
	int smallest = 0;

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("How many numbers you want to input: ");
	int inputAmount = keyboard.nextInt();

	System.out.println("Enter" + inputAmount + "numbers");
	for(int i = 1; i <= inputAmount; i++)
	System.out.println("Enter number" + i + ": "); 
	int number = keyboard.nextInt();

	}
}