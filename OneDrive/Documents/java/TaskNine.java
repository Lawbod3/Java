public class TaskNine {
	public static void main(String[] args) {

 int resultFour = 1;
 int sumFour = 0;
 int addition = 0;
 int additionSquare = 0;
for(int counter =0; counter < 5; counter++){

int four = 4;			
resultFour *= four;
sumFour += resultFour;		
}
	
int resultEight = 1;
int sumEight = 0;

for(int counter =0; counter < 5; counter++){

int eight = 8;
resultEight *= eight;
sumEight += resultEight;

}

addition = sumFour + sumEight;
additionSquare = addition * addition;
System.out.println(additionSquare);

}



}