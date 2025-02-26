public class LeftAndRight {
	public static void main(String[] args){

int control = 5;

	for(int outer = 1; outer < control; outer++){
        
           for(int inner = 1; inner <= outer; inner++){
	        System.out.print("* ");

}

	   for(int inner = outer; inner <= control; inner++){
		  System.out.print("  ");

}

	  for(int inner = outer; inner < control; inner++){
		  System.out.print("  ");
}

	  for(int inner = 1; inner <= outer; inner++){
	        System.out.print("* ");
}

System.out.println();
}

System.out.println();

 int controlTwo = 5;

	for(int outerTwo = 1; outerTwo <= controlTwo; outerTwo++){

	    for(int inner = outerTwo; inner < controlTwo; inner++){
	          System.out.print("* ");

}
	    for(int inner = 1; inner <= outerTwo; inner++){
		  System.out.print("  ");
}
 
	    for(int inner = 1; inner <= outerTwo; inner++){
		  System.out.print("  ");
}

             for(int inner = 1; inner <= 1; inner++){
		  System.out.print("  ");

}	    

	    for(int inner = outerTwo; inner < controlTwo; inner++){
	          System.out.print("* ");

}



System.out.println();
}

	}
}