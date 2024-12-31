import java.util.List;
import java.util.ArrayList;

public class ArrayEleven{
public static void main(String[] args){

int number = 2342;

List<Integer> result = digits(number);

System.out.println("The list of digits " + number + " are:" +result);

}



public static List<Integer> digits(int number){
List<Integer> result = new ArrayList<>();


while(number > 0){
int extraction = number % 10;
result.add(0, extraction);
number /= 10;

}

return result;

}
}
