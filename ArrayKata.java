import java.util.Arrays;

public class ArrayKata {

	public static int maximum(int...array) {
	int largest = Integer.MIN_VALUE;

	for(int counter = 0; counter < array.length ; counter++){
		if(array[counter] > largest ){
		 largest = array[counter];
}
	
}
	return largest;
}


	public static int minimum(int...array) {
	int smallest = Integer.MAX_VALUE;

	for(int counter = 0; counter < array.length; counter++){
		if(array[counter] < smallest) {
		smallest = array[counter];

}
}
	return smallest;
}

	public static int sum(int...array){
	int total = 0;

	for(int counter = 0; counter < array.length; counter++){
		total += array[counter];

}
	return total;
}

	public static int sumOfEven(int...array) {
	int totalEven = 0;

	for(int counter = 0; counter < array.length; counter++){
		if(array[counter] % 2 == 0){
		totalEven += array[counter];

}
}
	return totalEven;
}

	public static int sumOfOdd(int...array){
	int totalOdd = 0;

	for(int counter = 0; counter < array.length; counter++) {
		if(array[counter] % 2 != 0){
		totalOdd += array[counter];
}
}
		return totalOdd;
}

	public static int[] maxAndMin(int...array){
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;

	for(int counter = 0; counter < array.length; counter++){
		if(array[counter] > largest){
		largest = array[counter];
}
		if(array[counter] < smallest){
		smallest = array[counter];
}
}
  return new int[]{largest, smallest};
}

	public static int numOfOdd(int...array){
	int oddNumbers = 0;

	for(int counter = 0; counter < array.length; counter++){
		if(array[counter] % 2 != 0){
		oddNumbers = oddNumbers + 1;
}
}
	return oddNumbers;	
}
 	
	public static int numOfEven(int...array){
	int evenNumbers = 0;

	for(int counter = 0; counter < array.length; counter++){
		if(array[counter] % 2 == 0){
		evenNumbers = evenNumbers + 1;

}
} 
	return evenNumbers;
}

	




	public static void main(String...args){
	
	int[] array = {5, 9, 98, 10};

	int[] evenArray = {1, 2, 3, 4, 5, 6, 7, 9, 10};
	
	

	System.out.println("largest is: " +  maximum(array));
	System.out.println("Smallest is: " + minimum(array));
	System.out.println("Sum of array integers is: " + sum(array));
	System.out.println("Sum of Even is: " + sumOfEven(evenArray));
	System.out.println("Sum of Odd is: " + sumOfOdd(evenArray));
	System.out.println("Maximum and Minimum is: " + Arrays.toString(maxAndMin(array)));
	System.out.println("Number of element that's Odd number is: " + numOfOdd(evenArray));
	System.out.println("Number of element that's Even number is: " + numOfEven(evenArray));  

	
	


	}


}