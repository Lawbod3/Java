public class Logistic {
	
	public static int payment(int number){
	int ridersWage = 0;

	if(number < 50){
	return ridersWage = number * 160 + 5000;
	}
	 else if(number >= 50 && number <= 59){
	return ridersWage = number * 200 + 5000;
	}
	 else if(number >= 60 && number <= 69){
	return ridersWage = number * 250 + 5000;
	}
	 else if(number >= 70){
	return ridersWage = number * 500 + 5000;
	}
	
	return ridersWage;	
}






	public static void main(String[] args){

	System.out.println("Riders wage on succesful delivery is: " + payment(65));


}
}


