import java.util.Scanner;
public class ChapterFour {
	public static void main(String...aregs) {

	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter a grade or -1 to exit: ");
	int grade = keyboard.nextInt();

	int total = 0;
	int counter = 0;


	while(grade != -1){
	total = total + grade;
	counter++;

	System.out.print("Enter a grade or -1 to exit: ");
	grade = keyboard.nextInt();
	
}
	System.out.printf("Total of the %d grades is: %d%n", counter, 	total);

	if(counter != 0){
	double average = total / counter;

	System.out.printf("Average is %.2f%n", average);
} 
	else{
	System.out.println("No grades were entered");

}
	
}
}