import java.util.Scanner;

public class ChapterFiveName {
	public static void main(String...args) {

	int gradeA = 0;
	int gradeB = 0;
	int gradeC = 0;
	int gradeD = 0;

	Scanner keyboard = new Scanner(System.in);

	for(int i = 1; i <= 5; i++) {
	
	System.out.printf("Enter your name student%d: ", i);
	String name = keyboard.nextLine();
	
	System.out.println("Enter your grade e.g(A/B/C/D) : ");
	char grade = keyboard.nextLine().toUpperCase().charAt(0);

	switch(grade) {

		case 'A':
		gradeA++;
			break;
	
		case 'B':
		gradeB++;
			break;
	
		case 'C':
		gradeC++;
			break;
	
		case 'D':
		gradeD++;
			break;

		default:
	System.out.println("please enter a correct grade e.g(A or B or C or D): ");
         i--;

	}

 
}

   System.out.printf("%9s%8s%n", "Grade", "Summary");
   System.out.println(+ gradeA + " Student score grade A");
   System.out.println(+ gradeB + " Student score grade B");
   System.out.println(+ gradeC + " Student score grade C");
   System.out.println(+ gradeD + " Student score grade D");
   





	}

}