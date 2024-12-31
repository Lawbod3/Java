import java.util.Scanner;

public class ExercisePalindrome {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);
	
	int input = 0;
	int firstDigit = 0;
	int secondDigit = 0;
	int fouthDigit = 0;
	int fifthDigit = 0;

	
	System.out.println("Enter a five digit integer e.g (12345, 67894) : ");
	while(true) {
	input = keyboard.nextInt();
	if(input >= 10000 && input <= 99999){
     
	firstDigit = input / 10000;							secondDigit = input / 1000 % 10;						fouthDigit = input / 10 % 10;		
	fifthDigit = input % 10;

	if(firstDigit == fifthDigit && secondDigit == fouthDigit){
      System.out.printf("YES %d is a palindrome%n", input);}

	else{ System.out.printf("NO %d is not a palindrome%n", input);}
								break;		

} else{
 System.out.println("Please enter a five digit integer");

}

}	



	}

}