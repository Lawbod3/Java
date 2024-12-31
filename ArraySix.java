import java.util.Arrays;

public class ArraySix {
public static void main(String[] args){

int[] array = {2, 5, 8, 3, 6};
int[] runningTotal = runningTotalOf(array);

System.out.println("the running total is: "+Arrays.toString(runningTotal));

}


public static int[] runningTotalOf (int[] array){
	int sum = 0;
	int[] runningTotal = new int [array.length];
	for(int i = 0; i < array.length; i++){
	sum += array[i];
	runningTotal[i] = sum;
}
	return runningTotal;

}



	}