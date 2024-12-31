import java.util.Scanner;

public class PizzaWahala {
	public static void main(String...args) {

	Scanner keyboard = new Scanner(System.in);

	double sapaSizeSlice = 4;
	double smallMoneySlice = 6;
	double bigBoysSlice = 8;
	double odogwuSlice = 12;
	double sapaSizePrice = 2500;
	double smallMoneyPrice = 2900;
	double bigBoysPrice = 4000;
	double odogwuPrice = 5200;
	int boxToBuy = 0;
	int sliceLeftOver = 0;
	int priceToPay = 0;
	int guest = 0;
	int order = 0;

    while(true){
    System.out.println("\nNumber of guest: ");
     guest = keyboard.nextInt();
	if(guest == -1)break;
	if(guest < 1){
	System.out.println("Please make sure your input is not below 1");
continue;
}
    		
    System.out.println("""
	\nEnter a number to select any of our Pizza menu
		selection   Pizza type  number of slices box price:  
		1            Sapa size           4          2,500
		2            Small money         6          2,900
		3    	     Big boys            8          4,000
		4 	     Odogwu	         12         5,200:

 """);
	 order = keyboard.nextInt();
	if(order == -1)break;
	if(order < 1  || order > 4){ System.out.println("Please input  any of the selection menu digit");
continue;
}  

  	if(order == 1){
  boxToBuy =  (int) Math.ceil(guest / sapaSizeSlice);
  sliceLeftOver = (boxToBuy * (int) sapaSizeSlice) - (int) guest;
  priceToPay = boxToBuy * (int) sapaSizePrice;
}

 	if(order == 2) {
  boxToBuy = (int) Math.ceil(guest / smallMoneySlice);
  sliceLeftOver = (boxToBuy * (int) smallMoneySlice) -(int) guest;
  priceToPay = boxToBuy * (int) smallMoneyPrice;
}

	if(order == 3) {
  boxToBuy = (int) Math.ceil(guest / bigBoysSlice);  
  sliceLeftOver = (boxToBuy * (int) bigBoysSlice) - (int)guest;
  priceToPay = boxToBuy * (int) bigBoysPrice;
}

	if(order == 4) {
 boxToBuy = (int) Math.ceil(guest / odogwuSlice);
  sliceLeftOver = (boxToBuy * (int) odogwuSlice) - (int) guest;
  priceToPay = boxToBuy * (int) odogwuPrice;
}


	System.out.printf("Number of box of pizza to buy: %d box%n", boxToBuy);
	System.out.printf("Number of left over slices after serving: %d slices%n", sliceLeftOver);
	System.out.printf("Price: %d", priceToPay);
					
	System.out.println();break;
}
   
	
	}

}