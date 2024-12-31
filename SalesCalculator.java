import java.util.Scanner;

public class SalesCalculator {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);

	System.out.println("Calculate bonus accumulated on each sales , total bonus and weekly bonus");

	int sumValue = 0;
	int tag = 0;
	int value = 0;
	int item = 0;
	double totalbonus = 0;
	int valueMeasure = 0;

	
	
	while(tag != -1){
	System.out.printf("Sales rep should enter tag number: ");
	tag = keyboard.nextInt();
	if(tag == -1)break;


	System.out.println("How many items you want to calculate bonus: ");  
	valueMeasure =  keyboard.nextInt();
	if(valueMeasure == -1)break;

	for(int j = 1; j <= valueMeasure ; j++){
	System.out.printf("value of sold item %d: ", j);  
	value =  keyboard.nextInt();
	if(value == -1)break;


	double bonusPervalue = 0.09 * value;

	sumValue += value;

	System.out.println("Bonus on item: " + bonusPervalue);}

	totalbonus = 0.09 * sumValue;

	double weeklyEarnings = totalbonus + 200;

	System.out.println("Total accumulated bonus: " + totalbonus);


		System.out.println("Weekly earnings: " + weeklyEarnings);






		};

			

	}
}