import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListOfArrayElements {
	String[] word;
	Integer[] num;
	ArrayList<String> wordList;
	ArrayList<Integer> numList;
	int size;
	
/* 
* The Methods handleNumericalArray() and handleStringArray() is responsible for Getting the user's input for the size of the array and the inputting of the Array Elements
* The User's inputed integer value through Scanner which is then used as the size of the Array
* The User is required to input the required number of Values based on the inputed size of the array through a for loop
* The try and catch is used to restart the for loop if the user has inputed the wrong type of value
*/
	
	public void handleNumericalArray() {
		Scanner input = new Scanner(System.in);
	System.out.print("Enter Size of Array: ");
	int size = Integer.parseInt(input.nextLine());
	num = new Integer[size];
	System.out.println("Enter "+ size + " Integer Elements\n");
	try {
	for(int i = 0; i< size; i++) {
		System.out.print("Enter Element "+ i +": ");
		int number = input.nextInt();
		num[i] = number;
	}}
		catch(Exception e) {
			System.out.print("\nInvalid Integer\n");
			}
		
	}
	public void handleStringArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter Size of Array: ");
		int size = Integer.parseInt(input.nextLine());
		word = new String[size];
		System.out.println("Enter "+ size + " String Elements\n");
		
		for(int i = 0; i< size; i++) {
			System.out.print("Enter Element "+ i +": ");
			String letter = input.nextLine();
			word[i] = letter;
		}
	}
	
/*
 * The Methods copyAndManipulateNumericalArray() and copyAndManipulateStringArray() is responsible for copying the Values of the already declared array
 * The Already Declared array is then Copied to an ArrayList
 * The Manipulation of the ArrayList is then through various methods such as
 * add, remove, get, set, contains, indexOf, size, sort, subList, clear
 * 
 */
	public void copyAndManipulateNumericalArray() {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList(Arrays.asList(num));
		System.out.print("\nThis is the current Array List: "+numList);
		System.out.print("\nRemoving the element at Index 1: ");
		numList.remove(1);
		System.out.print("\nThis is the Array with the removed element at index 1: " + numList);
		System.out.print("\nAdded a number 12: ");
		numList.add(12);
		System.out.print("\nThis is the current Array List: "+numList);
		System.out.print("\ngets the element at index 1: ");
		System.out.print(numList.get(1));
		System.out.print("\nSets a number in index 1 from "+ numList.get(1) +" to 7 : "+numList);
		numList.set(1,7);
		System.out.print("\nReturns True if Array Contains Inputted Value: ");
		int ans = Integer.parseInt(input.nextLine());
		System.out.print(numList.contains(ans));
		System.out.print("\nThis is the current Array List: "+numList);
		System.out.print("\nThe element "+numList.get(1)+" is at Index:"+numList.indexOf(numList.get(1)));
		System.out.print("\nThe Current Size of the Array List is: "+numList.size());
		System.out.print("\nThis is the current Array List "+numList);
		numList.sort(null);
		System.out.print("\nSorts the Array from Lowest to Highest Value: "+numList);
		System.out.print("\nThis is the sublist of the array from 0 - 2 : "+numList.subList(0, 2));
		System.out.print("\nThis is the current Array List: "+numList);
		numList.clear();
		System.out.print("\nThis is the cleared Array List: "+numList+"\n");
	}
	
	public void copyAndManipulateStringArray() {
		Scanner input = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList(Arrays.asList(word));
		System.out.print("\nThis is the current Array List: "+wordList);
		System.out.print("\nRemoving the element at Index 1: ");
		wordList.remove(1);
		System.out.print("\nThis is the Array with the removed element at index 1: " + wordList);
		System.out.print("\nAdded a String Chicken: ");
		wordList.add("Chicken");
		System.out.print("\nThis is the current Array List: "+wordList);
		System.out.print("\ngets the element at index 1: ");
		System.out.print(wordList.get(1));
		System.out.print("\nSets a String in index 1 from "+ wordList.get(1) +" to Beef : "+wordList);
		wordList.set(1,"Beef");
		System.out.print("\nReturns True if Array Contains Inputted Value: ");
		String ans = input.nextLine();
		System.out.print(wordList.contains(ans));
		System.out.print("\nThis is the current Array List: "+wordList);
		System.out.print("\nThe element "+wordList.get(1)+" is at Index: "+wordList.indexOf(wordList.get(1)));
		System.out.print("\nThe Current Size of the Array List is: "+wordList.size());
		System.out.print("\nThis is the current Array List "+wordList);
		wordList.sort(null);
		System.out.print("\nSorts the Array from Alphabetically: "+wordList);
		System.out.print("\nThis is the sublist of the array from 0 - 2 : "+wordList.subList(0, 2));
		System.out.print("\nThis is the current Array List: "+wordList);
		wordList.clear();
		System.out.print("\nThis is the cleared Array List: "+wordList);
		
		
	}
	public static void main(String [] args) {
	ArrayListOfArrayElements Array = new ArrayListOfArrayElements();	
	Array.handleNumericalArray();
	Array.handleStringArray();
	Array.copyAndManipulateNumericalArray();
	Array.copyAndManipulateStringArray();
	}
}
