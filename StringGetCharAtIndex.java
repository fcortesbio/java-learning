public class StringGetCharAtIndex {
	public static void main(String args[]){
		String fruit = "Banana";

		// This will be 'a', because is at index - and 'a' occupies the same position;
		char letter = fruit.charAt(1);

		System.out.println("The character at index 1 is: " + letter);
	}
}
