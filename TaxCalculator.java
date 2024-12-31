import java.util.Scanner;

public class TaxCalculator {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);

	double tax = 0;
	double totalTax = 0;
	String name = " ";
	int i = 1;
	
	System.out.println("Tax calculator for three citizens");

	while( i <= 3 ){
     System.out.println("Enter your full name: ");
     name = keyboard.nextLine();

	
      System.out.println("Enter your yearly income: ");
	int yearlyIncome = keyboard.nextInt();

	keyboard.nextLine();


	i++;

	if(yearlyIncome <= 30000){
	tax = 0.15 * yearlyIncome; }

	else {
	tax = 0.20 * yearlyIncome; }


	System.out.printf("Tax for %s: %.2f%n", name, tax);

	totalTax += tax;


}


	System.out.printf("Total Tax generated from three citizens : %.2f%n",  totalTax);






	}

}