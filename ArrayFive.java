import java.util.List;
import java.util.ArrayList;

public class ArrayFive{
public static void main(String[] args){

int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


List<Integer> result = evenPosition(number); 


System.out.println("Element in Even position in the array are: "+result);


}


public static List<Integer> evenPosition(int[] number){
List<Integer> result = new ArrayList<>();

for(int i = 1; i < number.length; i++){

if (i % 2 == 0){
result.add(number[i]);

}

}

return result;
}


}