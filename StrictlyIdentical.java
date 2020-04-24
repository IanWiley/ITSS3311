//Assignment 3
//Ian Wiley, ITSS 3311
//https://github.com/IanWiley/ITSS3311
/*
Sample Run
Enter 5 elements of list1: 
1
2
3
4
5
Enter 5 elements of list2: 
1
2
3
4
5
Two lists are strictly identical
 */
 
import java.util.Scanner;  //Adds imports the java scanner package
public class StrictlyIdentical {
	public static void main(String args[]) {
		int[] list1 = new int[5];  //Integer arrays list1 and list2 are initialized with an array length of 5
		int[] list2 = new int[5];
		
		//Text Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 elements of list1: ");  //Prompts the user to enter the five values in list1
		for(int i = 0; i < list1.length; i++)  //Loops 5 times (the length of the array list1)
		{
			list1[i] = input.nextInt();  //Reads the user input for each individual value in the array
		}
		System.out.println("Enter 5 elements of list2: ");  //Prompts the user to enter the five values in list1
		for(int i = 0; i < list2.length; i++)  //Loops 5 times (the length of the array list2)
		{
			list2[i] = input.nextInt();  //Reads the user input for each individual value in the array
		}
		//
		if(equals(list1,list2))  //Checks if equals function returns true
		{
			System.out.println("Two lists are strictly identical");  //User is told that lists are identical, program is complete
		}
		else  //If equals function does not return true
		{
			System.out.println("Two lists are not strictly identical");  //User is told that lists are not identical, program is complete
		}
	}
	
	public static boolean equals(int[] array1, int[] array2)  //Function equals returning boolean is declared, taking in two interger arrayas as an input
	{		
		for(int i = 0; i < array1.length; i++)  //For loop runs over length of the array
		{
			if(array1[i] != array2[i])  //Checks if values in the ith element of the array are not equal
			{
				return false;  //Function returns false, stopping the for loop's execution
			}
		}
		return true; //If for loop did not return false at any point, function returns true
	}
}
