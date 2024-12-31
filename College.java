import java.util.Scanner;

public class College {
	public static void main(String...bode) {

	Scanner keyboard = new Scanner(System.in);

	int passed = 0;
	int failed = 0;
	int counter =1;

	while(counter <= 10) {
	System.out.println("Enter a result (passed = 1, failed = 2) : ");
	int result = keyboard.nextInt();
	if(result < 1 || result > 2) {
 System.out.println("Please enter correct input");
continue;
}

	if(result == 1){
	passed = passed + 1;
			
}
	if(result == 2){
	failed = failed + 1;
}

counter++;
}

	System.out.printf("Number of Passed student: %d%n", passed);
	System.out.printf("Number of Failed student: %d%n", failed);

	if(passed >= 8) System.out.println("Bonus to instructor");





	}
}