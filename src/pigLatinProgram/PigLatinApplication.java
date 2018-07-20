package pigLatinProgram;

import java.util.Scanner;

public class PigLatinApplication {	
	
	public static void main(String[] args) {
		
		// open the scanner
		Scanner scnr = new Scanner(System.in);
		
		//declares variables needed.
		String userInput;
		String lowerUserInput;
		String vowel = "aeiou";
		int x;
		int vowelNumber = 99;
		String firstHalf;
		String secondHalf;
		char response;
		
		//initial do loop that sets the restart question and response 
		do {
			
		//asks and collects the word, leaves it as original and creates a lower case	
		System.out.println("Enter a word you would like to be translated:");
		userInput = scnr.next().trim();
		lowerUserInput = userInput.toLowerCase();
		
		//for loop runs through the input based on its length 
		//and looks for vowels at each index and assigns the index to a integer 
		for (x = 0; x < userInput.length(); x++) {
		if (vowel.contains(String.valueOf(lowerUserInput.charAt(x))) == true) {
			vowelNumber = x;
			
			//this breaks out of the loop at the earliest sign of a vowel
			break;
		}
		else {
			//this assigns an arbitrary value if there are no vowels in the word
			vowelNumber = 99;
			}
		}
		
		//this if uses the vowel index to understand what to print.
		//The first parameter is starts with a vowel followed by no vowel.
		if(vowelNumber == 0) {
			System.out.println(userInput + "way");
		} else if (vowelNumber == 99) {
			System.out.println(userInput + "way");
		} else {
			firstHalf = userInput.substring(0 , vowelNumber);
			secondHalf = userInput.substring(vowelNumber);
			System.out.println(secondHalf + firstHalf + "ay");
		}
		
		//collects restart response and assigns it for initial do loop
		System.out.println("Would you like to translate another word? (y to continue)");
		response = scnr.next().trim().charAt(0);
		
		} while (response == 'y');
		
		//alerts user they are leaving and closes scanner
		System.out.println("Goodbye!");
		scnr.close();
	
}
}
