public class DiamondStar {
    public static void main(String[] args){

 int control = 10;

    for(int outer = 1; outer <= control; outer++){
	for(int inner = outer; inner < control; inner++){
	if(inner % 2 == 0) System.out.print(" ");
}

    for(int inner = 1; inner <= outer; inner++){
	if(outer % 2 != 0) System.out.print("*");
}


 System.out.println();
}


 int controlTwo = control - 2;

    for(int outerTwo = 1; outerTwo < controlTwo; outerTwo++) {     
  	for(int innerTwo = 1; innerTwo <= outerTwo; innerTwo++){
	    if(innerTwo % 2 != 0) System.out.print(" ");
}

	for(int innerTwo = outerTwo; innerTwo < controlTwo; innerTwo++){
	    if(outerTwo % 2 != 0) System.out.print("*");

}
System.out.println();
}


	}
} 