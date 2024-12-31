public class ArrayOne {

public static int largestNumber (int[] array){
	int largestElement = array[0];
	for (int value: array){
	if (value > largestElement){
	largestElement = value;
}
}
	return largestElement;
}




public static void main(String[] args){

int[] array = {10, 25, 77, 29, 87, 67, 0, -77, -22, 20};

System.out.printf("The largest element is: %d%n",largestNumber(array));



}
	}