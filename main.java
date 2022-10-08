package main3and4;

public class main {

	public static void main(String[] args) {
//	1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		System.out.println("Question #1:");
		
		int [] ages = {3,9,23, 64, 2, 8, 28, 93};
		
//	a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		int lastMinusFirst = (ages[ages.length -1] - ages[0]);
		System.out.println(lastMinusFirst);
		
//	b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		int lastMinusFirst2 = (ages2[ages2.length -1] - ages2[0]);
		System.out.println(lastMinusFirst2);

		
//	c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		System.out.println("Question #1:");
		
		double sum = 0;
		
		for (int x : ages) {
			sum += x;
		}
			System.out.println(sum/ages.length);

		
//	2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//	a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//	b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		System.out.println(" ");
			System.out.println("Question #2:");
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sums = 0;
		for (int letters = 0; letters < names.length; letters++) {
		
			sums += names[letters].length(); }
		
			System.out.println(sums/names.length); //average letters in each name achieved by dividing the total number of letters buy the number of names. 23/6 = 3.83
			
//	3.	How do you access the last element of any array?
		System.out.println(" ");	
			System.out.println("Question #3:");
			
			String [] germanWords = {"Die", "Der", "Das"};
			
			System.out.println(germanWords[germanWords.length -1]);  //you access the last element of referring to the index number in [] 
			
//	4.	How do you access the first element of any array?
		System.out.println(" ");		
			System.out.println("Question #4:");
			
			String [] sodaFlavors = {"Grape", "Strawberry", "Lime"};
				System.out.println(sodaFlavors[0]); //you access the first element of an array by referring to index 0 
				
//	5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		System.out.println(" ");
			System.out.println("Question #5:");
			
			int [] nameLengths = new int[names.length]; //new int created
			
			for(int i=0; i<names.length; i++) {  
				nameLengths[i] = names[i].length(); 
			}
			for(int a : nameLengths) {
				System.out.println(a);
			}
			
		
//	6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	System.out.println(" ");
		System.out.println("Question #6:");
	
		int sumOfElements = 0;
		for (int i=0; i<nameLengths.length; i++) {
			sumOfElements = sumOfElements + nameLengths[i];
		}
			
		System.out.println("Sum of elements in nameLengths array is: " + sumOfElements);
		
//	7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	System.out.println(" ");	
		System.out.println("Questions #7:");
		
		System.out.println("Hello ".repeat(3));
		
		
//	8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	System.out.println(" ");
		System.out.println("Question #8:");
	
		String firstName = "Jane";
		String lastName = "Doe";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
//	9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	System.out.println(" ");	
		System.out.println("Question #9:");
		
		int [] randomNumbers = {16, 22, 55, 4};
		
			System.out.println("Sum is greater than 100: " + greaterThan100(randomNumbers));
		
//	10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	System.out.println(" ");
		System.out.println("Question #10:");
	
		double [] costOfFood = {15.20, 3.60, 1.20, 8.50};
		
			System.out.println("Average cost of food is: " + averageOfFoodCost(costOfFood));
		
//	11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	System.out.println(" ");
		System.out.println("Question #11:");
		
		double [] costOfDolls = {20.50, 15.60, 12.40, 25.80};
		double [] costOfActionFigures = {5.20, 8.40, 12.40, 8.70};
		
		System.out.println("Average cost of dolls are greater than average cost of action figures: " + averageOfToyCost(costOfDolls, costOfActionFigures));
		
//	12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	System.out.println(" ");
		System.out.println("Question #12:");
		
		boolean isHotOutside = true;
		double moneyInPocket = 20.80;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
//	13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	System.out.println(" ");
		System.out.println("Question #13:");

		//Write a method called willWork that takes two arrays of double and returns true if income is greater than bills
		
		double [] income = {2500, 200, 50};
		double [] bills = {200, 1200, 600, 500};
	
			System.out.println(willWork(income, bills));
		
		
	
	} // end of main method
	
	//method for quesiton #8
	public static String createFullName(String x, String y) {  
		return x + " " + y;
	}//end of question #8
	
	
	//method for question #9
	public static boolean greaterThan100 (int [] arr) {
		int sum = 0;
		for (int x : arr) {
			sum += x;
		}
		if (sum>100) {
			return true;
		}
		return false;
	}// end of question #9
	
	
	
	//method for question #10
	public static double averageOfFoodCost (double [] arr) {
		double sum = 0;
		for (double x : arr) {
			sum += x;
		} return sum/arr.length;
	}//end of question #10
	
	
	//method for question #11
	public static boolean averageOfToyCost (double [] arr, double [] arr2) {
		double sum = 0;
		for (double x : arr){
			sum+= x;
		}
		double sum2 = 0;
		for (double y : arr2) {
			sum2 += y;
		}
		if ((sum/arr.length) > (sum2/arr2.length)) {
			return true;
		}
			return false;	
	}//end of question #11
	
	
	//method for question #12
	public static boolean willBuyDrink (boolean isHot, double money) {
		if (isHot == true && money > 10.50) {
			return true;
		}return false;
		
	}//end of question #12
	
	
	//method for question #13
	public static boolean willWork (double [] arr, double [] arr2) {
		double sum = 0;
		for(double y : arr) {
			sum += y;
		}
		double sum2 = 0;
		for(double z : arr2) {
			sum2 += z;
		}
		
		if (sum > sum2) {
			return true;
		}return false;
		
	}//end of question #13
	
	
	}//end of class

