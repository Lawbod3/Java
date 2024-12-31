import java.util.Scanner;

public class Miles {
	public static void main(String...args){

	Scanner keyboard = new Scanner(System.in);
	
	float combineMilesPerGallon = 0;
	float milesPerGallon = 0;
	int counter = 1;
	int totalMiles = 0;
	int totalGallon = 0;
	int miles = 0;
	int gallon = 0;

	System.out.println("Enter a number for miles and gallon or exit with -1: ");
	
	

	while(miles != -1) {	
	System.out.println("Enter a number for miles or exit with -1: ");
	 miles = keyboard.nextInt();
	if(miles == -1)break;

	 System.out.println("Enter a number for gallon or exit with -1: ");
	gallon = keyboard.nextInt();
	if(gallon == -1)break;

		totalMiles += miles;
		totalGallon += gallon;
	
	 milesPerGallon = (float) miles / (float) gallon; 

	combineMilesPerGallon += milesPerGallon;

	System.out.println("Miles per gallon is : " + milesPerGallon);
				
}

System.out.printf("Combined miles per gallon is : %.2f%n",combineMilesPerGallon);




	}
}