public class ArraySeven{
public static void main(String[] args){

	String word = "boob";

	boolean valid = isPalindrome(word);


	if (valid){
	System.out.println( word + " is a palindrome");
	}

	else{
	System.out.println( word + " is not a palindrome");

}
	}

public static boolean isPalindrome (String word){

	word = word.toLowerCase();

	char[] charArray = word.toCharArray();

	int leftSide = 0;
	int rightSide = charArray.length - 1;


	while (leftSide < rightSide){
	if (charArray[leftSide] != charArray[rightSide]){

	return false;

}

	leftSide++;
	rightSide--;

}

	return true;


}
	}