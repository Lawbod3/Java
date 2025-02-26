public class MiniDiamond {

 public static void main(String[] args){


  int control = 5;

 for(int outer = 1; outer <= control; outer++){
     for(int inner = outer; inner <= control; inner++){
           if(outer == 4)continue;
        System.out.print(" ");
}

      for(int inner = 1; inner <= outer; inner++){
	     if(outer == 4)continue; 
	     System.out.print("* ");
}

if(outer == 4)continue;
System.out.println();

}





int controlTwo = 3;

   for(int outerTwo = 1; outerTwo <= controlTwo; outerTwo++){
		System.out.print(" ");
		System.out.print(" ");
      for(int inner = 1; inner <= outerTwo; inner++){
		System.out.print(" ");

}
 
      for(int inner = outerTwo; inner <= controlTwo; inner++){
		System.out.print("* ");

}







System.out.println();

} 























         }

}