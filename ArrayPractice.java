public class ArrayPractice {
	public static void main(String[] args) {

	if(args.length != 3) {

	System.out.printf("Errror: please re-enter the entire command, including%n" + "an array size, initial value and increment.%n");
}
 else{
	int arrayLength = Integer.parseInt(args[0]);
	int[] array = new int[arrayLength];

	int initialValue = Integer.parseInt(args[1]);
	int increment = Integer.parseInt(args[2]);

	for (int counter = 0; counter < array.length; counter++) {
	    array[counter] = initialValue + increment * counter;
}

	System.out.printf("%s%8s%n", "Index", "value");

	for (int counter = 0; counter < array.length; counter++) {
	System.out.printf("%5d%8d%n", counter, array[counter]);

			}

		}

	}
}