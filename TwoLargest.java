import java.util.Scanner;

public class TwoLargest {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);

	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	int number = 0;

	for(int count = 1; count <= 10 ; count++){
	System.out.println("Enter a number: ");
	number = keyboard.nextInt();

	if(number > largest){
	secondLargest = largest;
	largest = number;
}

	else if (number > secondLargest && number != largest){
		secondLargest = number;
} 



}

	if(largest == Integer.MIN_VALUE || secondLargest == Integer.MIN_VALUE){

System.out.println("All numbers are equal");
}
  else { System.out.println("Largest is: " + largest);

	System.out.println("secondLargest is: " + secondLargest);

}





	}
}