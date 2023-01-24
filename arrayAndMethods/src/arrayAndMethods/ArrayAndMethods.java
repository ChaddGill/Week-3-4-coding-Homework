package arrayAndMethods;

public class ArrayAndMethods {

	public static void main(String[] args) {
		
// 1) Create an array of int called ages that contains the following values: 
// 3, 9, 23, 64, 2, 8, 28, 93.
// A) Programmatically subtract the value of the first element in the array
// from the value in the last element of the array (do not use ages[7] in code.
// print the result to the console.
// B) Add a new age to your array and repeat the steps above to ensure it is 
// dynamic
// C) Use a loop to iterate through the array and calculate the average age.
// Print the result to the console.

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println("The difference in ages with the last element and the first element is: "
				+ (ages[ages.length - 1] - ages[0]));
		
		// showing the array ages
		
		for( int number : ages) {
			System.out.println(number);
		}
		
		// added 105 to the end of the ages[] to show that it is dynamic
		
		int[] ages1 = { 3, 9, 23, 64, 2, 8, 28, 93, 105};
		
		System.out.println("The difference in ages with the last element and the new first element "
				+ "is: "+ (ages1[ages1.length - 1] - ages1[0]));
		
		// showing the new array ages1
		
		for( int number1 : ages1) {
		System.out.println(number1);
		}
		
		// showing the sum of the ages array
		
		int sum = 0;
		for (int number : ages) {
			sum += number;
		}
		System.out.println("The sum of the ages is: " + sum); 
		
		// showing the average of the ages array
		
		int average = sum / ages.length;
		System.out.println("The average age is: " + average);
		
// 2) Create an array of String called names that contain the following values:
// "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
// A) Use a loop to iterate through the array and calculate the average number
// of letters per name. Print the results to the console.
// B) Use a loop to iterate through the array again and concatenate all the
// names together, separated by spaces, and print the results to the console.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// use loop to find sum and average of letters per name
		
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		
		System.out.println("The sum of the letters per name: " + sumOfLetters);
		
		// here is the average letters in the names
		
		int averageLetters = sumOfLetters / names.length;
		System.out.println("The average letters in the names: " + averageLetters);
		
		// loop through array and concatenate names together with spaces
		
		String sumOfNames = "";
		for(String name : names) {
			sumOfNames += name + " ";
			System.out.println(sumOfNames);
		}
		System.out.println(sumOfNames);
		System.out.println(names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3] + ", " 
				+ names[4] + ", " + names[5] + ".");
		
// 3) How do you access the last element of any array?
		
		System.out.println("The last element of the ages array: " + ages[ages.length - 1]);
		System.out.println("The last element of the names array: " + names[names.length - 1]);
		
		// to access the last element of the array you can use system out
		// println with the array name then in the [] you put the array name
		// with a period and length minus 1 that way it goes the entire length
		// of the array than minus one is for the position since the array starts
		// with zero.
		
// 4) How do you access the first element of any array?	
		
		System.out.println("The first element of the ages array: " + ages[0]);
		System.out.println("The first element of the names array: " + names[0]);
		
		// to access the first element of the array you can use system out
		// println with the array name then in the [] you put the first position
		// number which is zero.
		
		
// 5) Create a new array of int called nameLengths. Write a loop to iterate over
// the previously created names array and add the length of each name to the 
// nameLengths array.
		
		int[] nameLength;
		
		nameLength = new int [names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLength[i] = names[i].length();
			}
		for (int s = 0; s < nameLength.length; s++) {
			System.out.println("The name length of " + names[s] + " is " + nameLength[s]);
		}
		
// 6) Write a loop to iterate over the nameLengths array and calculate the sum
// of all the elements in the array. Print the result to the console.
		
		int sumNumName = 0;
		
		for (int i = 0; i < nameLength.length; i++) {
			sumNumName += nameLength[i];
		}
		
		System.out.println("Sum of nameLength is: " + sumNumName);
		
// 7) Write a method that takes two Strings, word, and an int, n, as arguments
// and returns the word concatenated to itself n number of times.
		
		
		System.out.println("What is your word : " + words("Sweet", 5));
		
		
// 8) Write a method that takes two Strings, firstName and lastName, and returns
// a full name
		
		System.out.println(name());
		
// 9) Write a method that takes an array of int and returns true if the sum of 
// all the ints in the array is greater than 100.
		
		System.out.println("Together is it greater than 100, true or false: " + numbers());
		
// 10) Write a method that takes an array of double and returns the average of
// all the elements in the array
		
		System.out.println("The average of myArray is: " + numDouble());
		
// 11) Write a method that takes two arrays of double and returns true if the 
// average of the elements in the first array is greater than the average of the
// elements in the array.
		
		System.out.println("Is myArray2 greater than myArray3? : " + statement());
		
// 12) Write a method called willBuyDrink that takes a boolean isHotOutside, and
// a double moneyInPocket, and returns true if it isHotOutside and if 
// moneyInPocket is greater than 10.50.
		
		System.out.println("Can we get a drink : " + willBuyDrink());
		
// 13) Create a method of own that solves a problem.
// This method shows if we will have a full squad to game. I chose to this write this as I like to 
// play video games with friends.		
		
		System.out.println("Do we have a full squad today? : " + willWeHaveFullSquad());
		
	}

// method for question 7
	
	public static String words(String word, int n) {
		
		if(n == 1)
			return word;
		return word + words(word, n - 1);
		
	}
	
// method for question 8
	
	public static String name() {
		
		String firstName = "Chadd";
		String lastName = "Gillmore";
		
		String fullName = "My full name is: " + firstName + " " + lastName;
		return fullName;
		
	}
	
// method for question 9
	
	public static boolean numbers() {
		
		int[] numberArray = {28, 43, 57, 13, 27, 8};
		
		int sumQ9 = 0;
		for(int i = 0; i < numberArray.length; i++) 
			{sumQ9 += numberArray[i];
		}
		return (sumQ9 > 100);
	}

// method for question 10
	
	public static double numDouble() {
		double[] myArray = {5.6, 8.9, 28.4, 33.1, 35.7, 58.2, 65.9};
		
		double sumQ10 = 0;
		for(double number1 : myArray) {
			sumQ10 += number1;
		}
		return(sumQ10 / myArray.length);	
	}
	
// method for question 11
	
	public static boolean statement() {
		
		double[] myArray2 = {5.6, 28.2, 35.9, 58.6, 10.6};
		double[] myArray3 = {15.4, 67.0, 13.5, 30.1, 1.5};
		
		double sum2 = 0;
		double sum3 = 0;
		
		for(int i = 0; i < myArray2.length; i++) {
			sum2 += myArray2[i];
		}
		
		for(int a = 0; a < myArray3.length; a++) {
			sum3 += myArray3[a];
		}
		return sum2 > sum3;
	}
	
// method for question 12
	
	public static boolean willBuyDrink() {
		
		boolean isHotOutside = true;
		double moneyInPocket = 13.1;
		
		return isHotOutside && moneyInPocket > 10.50;
	}
	
// method for question 13
		
	public static boolean willWeHaveFullSquad() {
		
		boolean weekend = true;
		int friends = 5;
		
		return weekend && friends > 4;
		
		 
	}
	
}

