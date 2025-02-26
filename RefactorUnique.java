import java.util.Arrays;
import java.util.Scanner;


public class RefactorUnique { 

	public static void main(String[] args){
    
	Scanner input = new Scanner(System.in);
	int[] array = new int[10];

        Arrays.fill(array, -1);

 int counter = 0;
while(counter < array.length){
System.out.println("Please enter a number from 10 to 100: ");
 int user = input.nextInt();

while(user < 10 || user > 100){
System.out.println("Invalid input, Please enter a digit from 10 to 100");
     user = input.nextInt();
}

array[counter] = user;
counter++;
}

int[] result = removeUnique(array);

System.out.println(Arrays.toString(array));
System.out.println(Arrays.toString(result));

}


public static int[] removeUnique(int[] array){

int temp = 0;
for(int outer = 0; outer < array.length; outer++){
	int record = 0;
     for(int inner = outer + 1 ; inner < array.length; inner++){
	 if(array[outer] == array[inner])record++;

}

if(record > 0)temp += 1;
}

int[] result = new int[array.length - temp ];

int count = 0; 

 for(int outside = 0; outside < array.length; outside++){
         boolean isDuplicate = false;
     for(int inside = outside + 1; inside < array.length; inside++){
	if(array[outside] == array[inside]){ 
           isDuplicate = true;
             break;
  }  	
} 
  if(!isDuplicate){
 result[count] = array[outside];
count++;
	}
    
}
 

return result;

}


}