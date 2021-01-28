//****Project 1****
//
//Author: Scott Tabaka
//Instructor: Steve Riegerix
//Class: CMPSCI 2700(Fall 2018)
//Due Date: September 9, 2018

/*
Generate Vehicle Plate Numbers
Assume that a vehicle plate number follows the template xyx yxyx 
where x is a character and y is a digit. Write a program that generates 
10 random plate numbers to the standard output.
*/

import java.util.Random;

public class PlateGenerator 
{

	public static int Createrandomnumber()
	{
		int min = 48;
		int max = 57;
		Random rand = new Random();
		int x = rand.nextInt((max - min) + 1) + min;
		return x;
	}
	
	public static int Createrandomletter()
	{
		int min = 65;
		int max = 90;
		Random rand = new Random();
		int x = rand.nextInt((max - min) + 1) + min;
		return x;
	}

	
	public static void main(String[] args) 
	{
		char[] plateArray;
		plateArray = new char[8];

		
		System.out.print("*****Random License Plate Generator*****\n\n");
		
		for(int k=0;k<10;k++)
		{
			int i=0;
			plateArray[i] = (char)Createrandomletter();
			i++;
			plateArray[i] = (char)Createrandomnumber();
			i++;
			plateArray[i] = (char)Createrandomletter();
			i++;
			plateArray[i] = ' ';
			i++;
			plateArray[i] = (char)Createrandomnumber();
			i++;
			plateArray[i] = (char)Createrandomletter();
			i++;
			plateArray[i] = (char)Createrandomnumber();
			i++;
			plateArray[i] = (char)Createrandomletter();

			System.out.printf("%-11s","Plate #" + (k+1) + ": ");
			System.out.println(plateArray);
		}
	}
}