public class VarargsAverage {

       public static void main(String[] args){
     
float result = average(7, 4, 5, 7);

  System.out.println(result);
}


public static float average(int...numbers){

float sum = 0;
float average = 0;

for(int counter : numbers){
 sum += counter;
}

if(sum == 0) average = 0; 
else { average =  sum / numbers.length;}



return average;

}









}