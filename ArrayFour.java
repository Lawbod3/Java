import java.util.ArrayList;
import java.util.List;

public class ArrayFour{
public static void main(String[] args){

	int[] number = {0, 1, 2, 3, 4, 5, 6, 7};

	List<Integer> result = oddPosition(number);


	System.out.println("elements in odd position are: "+result);

}



public static List<Integer> oddPosition (int[] number){
	List<Integer> result = new ArrayList<>();
	
	for (int i = 1; i < number.length; i++){

	if (i % 2 != 0){
	result.add(number[i]);
	
}

}

	return result;


}
	}