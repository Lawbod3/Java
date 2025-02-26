public class IncreasingLoop {

	public static void main(String[] args) {
	int control= 7;
     for(int outer= 1; outer < control; outer++){
          System.out.print(" ");
	for(int inner= 1; inner <= outer; inner++){ 
	System.out.print("*");

}
 System.out.println();
}


	}


}