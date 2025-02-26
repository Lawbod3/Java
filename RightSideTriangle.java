public class DownTriangle {
	public static void main(String[] args){

int control = 10;
	for(int outer= 1; outer <= control; outer++){
	    for(int inner= outer; inner <= control; inner++){  
		System.out.print("  ");
	}
	    for(int inner= 1; inner <= outer; inner++){
		System.out.print("* ");
	}
System.out.println();
}


int controlTwo = control;
	for(int outerTwo= 1; outerTwo <= control; outerTwo++){
               System.out.print("  ");
	    for(int inner= 1; inner <= outerTwo; inner++){  
		System.out.print("  ");
	}
	    for(int inner= outerTwo; inner < controlTwo; inner++){
		System.out.print("* ");
	}
System.out.println();
}










	}
}