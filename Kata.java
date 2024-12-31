
import java.util.Scanner;
public class Kata {
 
public static boolean isEven(int number){

	if(number % 2 == 0) {
     	return true;
}
    else{
	return false;
		}
}




public static int subtraction(int firstDigit, int secondDigit){
	return Math.abs(firstDigit - secondDigit);

}

public static float division(float digitOne, float digitTwo){
	if(digitOne == 0){
	return 0;
}

   else{
   return  digitOne / digitTwo;
	
}


} 

public static int factor(int number){
	
	int i = 1;
	for(int counter =1; counter < number; counter++){
	if(number % counter == 0){
	i++;
}
}
	return i;
}


public static  boolean square(int number){
	int squareNumber = (int) Math.sqrt(number); 
	return squareNumber * squareNumber == number;
}

public static boolean palindrome(int number){
	int extractionOne = number / 10000;
	int extractionTwo = number / 1000 % 10;
	int extractionFour = number / 10 % 10;
	int extractionFive = number % 10;
	if(extractionOne == extractionFive && extractionTwo == extractionFour){
	return true;
}
	else{
	return false;
}
}
 

public static int factorial(int number){
	int result = 1;
	for(int counter = 1;  counter <= number; counter++){
	result *= counter;
	
}
	return result;
}

public static int squareOf(int number){
	return number * number;

}


	
	public static void main(String... args) {

	System.out.println(isEven(8));
	System.out.println(subtraction(8, 6));
	System.out.println(division(7, 2));
	System.out.println(factor(8));
	System.out.println(square(36));
	System.out.println(palindrome(54145));
	System.out.println(factorial(5));
	System.out.println(squareOf(5));



	}

}