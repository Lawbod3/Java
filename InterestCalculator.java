import java.util.*;

public class InterestCalculator
{
	public static void main(String...args)
{
 	System.out.println("Accumulated Balance is: " + calculator(0, 0, 0, 0, 0));



}

	public static double calculator(double initial_Investment, double monthly_Contribution, double length_Of_Time_Yearly,  double interest_Rate, int compound_Frequency)  

{
	double accumulated_Balance = initial_Investment;
	double daily = 365;
	double weekly = 52;
	double monthly = 12;
	
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Please input  Initial investment amount: "); 
	initial_Investment = keyboard.nextDouble();

	System.out.println("Please input the interest rate: ");
	interest_Rate = keyboard.nextDouble();

	System.out.println("Please input the number of years you plan to save: ");
	length_Of_Time_Yearly = keyboard.nextDouble();

	System.out.println("please input Monthly contribution amount: ");
	monthly_Contribution = keyboard.nextDouble();

	System.out.println("""
		Please Choose time per year the interest will be compounded
			PRESS 1: Daily
			      2: Weekly
			      3: Monthly
			      4: Yearly
		""");
	compound_Frequency = keyboard.nextInt();

	int timelyCounter;

		switch(compound_Frequency)
		{

			case 1: timelyCounter = (int) (daily * length_Of_Time_Yearly);
for (int i = 1; i < timelyCounter; i++){
 accumulated_Balance = initial_Investment * ((interest_Rate / 100) / daily); 
		if(i % 30 == 0) {
 accumulated_Balance += monthly_Contribution;
}
}
	break;
		

			case 2:  for (int i = 1; i < weekly * length_Of_Time_Yearly; i++){
 accumulated_Balance += initial_Investment * ((interest_Rate / 100) / weekly); 
		if(i % 4 == 0) {
 accumulated_Balance += monthly_Contribution;
}
}
	break;
		

			case 3: for (int i = 1; i < monthly * length_Of_Time_Yearly; i++){
 accumulated_Balance += initial_Investment * ((interest_Rate / 100) / monthly);
 accumulated_Balance += monthly_Contribution;

}
	break;

			case 4: for (int i = 1; i < length_Of_Time_Yearly; i++){
 accumulated_Balance += initial_Investment * (interest_Rate / 100);
 accumulated_Balance += monthly_Contribution * monthly;

}
	break;

			default: System.out.println("Invalid Compound Frequncy selection. Please enter a number from the range of (1-4)");
					return 0;

}

		return accumulated_Balance;


}
}