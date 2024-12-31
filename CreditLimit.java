import java.util.Scanner;

public class CreditLimit {
	public static void main(String... args) {

	Scanner keyboard = new Scanner(System.in);

	int accountNumber = 0;
	int beginingBalance = 0;
	int totalCharges = 0;
	int totalCredit = 0;
	int allowedCredit = 0;
	int creditLimit = 0;

	System.out.println("Enter your details to calculate credit liimit");

	while(accountNumber != -1){
	System.out.println("Enter Account number: ");
	accountNumber = keyboard.nextInt();
	if(accountNumber == -1){
			break;}

	System.out.println("Enter Begining balance: ");
	beginingBalance = keyboard.nextInt();
	if(beginingBalance == -1){
			break;}

	System.out.println("Enter Total charges: ");
	totalCharges = keyboard.nextInt();
	if(totalCharges == -1){
			break;}

	System.out.println("Enter Total credit: ");
	totalCredit = keyboard.nextInt();
	if(totalCredit == -1){
			break;}

	System.out.println("Enter allowed credit: ");
	allowedCredit = keyboard.nextInt();
	if(allowedCredit == -1){
			break;}
	
	int newBalance = beginingBalance - totalCharges - totalCredit;

	System.out.printf("New balance is: %d%n", newBalance);

	creditLimit = beginingBalance + allowedCredit;

	if(newBalance <= creditLimit){
	
	System.out.printf("Credit Limit is: %d%n", creditLimit);}

	else {
	System.out.println("Credit limit exceeded");}



	
	
}
		}

}