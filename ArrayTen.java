import java.util.ArrayList;

public class ArrayTen{
public static void main(String[] args){

ArrayList<String> first = new ArrayList<>();
first.add("a");
first.add("b");
first.add("c");

ArrayList<Integer> second = new ArrayList<>();
second.add(1);
second.add(2);
second.add(3);


ArrayList<Object> alternatingList = alternate (first, second);

System.out.println("The alternating list is: "+alternatingList);


}

public static ArrayList<Object> alternate (ArrayList<?>first, ArrayList<?>second){
	ArrayList<Object> outcome = new ArrayList<>();
	 
	int minLength = Math.min(first.size(), second.size());

	for (int i = 0; i < minLength; i++){
	outcome.add(first.get(i));
	outcome.add(second.get(i));
}
	return outcome;


}



	}