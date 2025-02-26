public class DoubleTriangle {

	public static void main(String[] args){

int control = 5;
int controlTwo = 11;

	for(int outer= 1; outer <= control; outer++){
	    for(int inner = outer; inner < control; inner++){  
		 System.out.print("  ");
}
	    for(int inner = 1; inner <= outer; inner++){
		System.out.print("* ");

}

	    for(int inner = 1; inner < outer; inner++){
		 System.out.print("* ");
}

           for(int inner = outer; inner < control; inner++){

		 System.out.print("  ");   

}
 	   for(int inner = outer; inner < control; inner++){

		 System.out.print("  ");   

}

	   for(int inner = 1; inner <= outer; inner++){ 
		 System.out.print("* ");  
}

	    for(int inner = 1; inner < outer; inner++){ 
		 System.out.print("* ");  
}



System.out.println();
}


	}
}