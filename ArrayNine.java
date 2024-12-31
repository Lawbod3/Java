import java.util.ArrayList;
import java.util.List;

public class ArrayNine {
public static void main(String[] args){

List<String> first = new ArrayList<>();
	first.add("a");
	first.add("b");
	first.add("c");

List<Integer> second = new ArrayList<>();
	second.add(1);
	second.add(2);
	second.add(3);


List<Object> joint = combine(first, second);

System.out.println("The concatenated list: "+ joint);

}


public static List<Object> combine(List<?>first, List<?>second){
	List<Object> result = new ArrayList<>(first);
	result.addAll(second);
	return result;
}


	}