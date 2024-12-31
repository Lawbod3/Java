public class ArrayEight {
public static void main(String[] args){

int[] numbers = {1, 8, 3, 4, 2};


System.out.printf("sum with for loop is: %d%n",sumFor(numbers));
System.out.printf("sum with while loop is: %d%n",sumWhile(numbers));
System.out.printf("sum with do loop is: %d%n",sumDo(numbers));



}





public static int sumFor (int[] numbers){
	int sum = 0;
	for (int i = 0; i < numbers.length; i++){
	sum += numbers[i];

}
	return sum;

}



public static int sumWhile (int[] numbers){
	int sum = 0;
	int i = 0;
	while( i < numbers.length){
	sum += numbers[i];
	i++;
}
	return sum;

}



public static int sumDo (int[] numbers){
	int sum = 0;
	int i = 0;
	do {
	sum += numbers[i];
	i++;
}
	while (i < numbers.length);

	return sum;
}

	}