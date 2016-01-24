package com.sqa.du.basics;
import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the \"I will calculate the average number 4U\" app! :)");
		System.out.print("Please tell me how many numbers we will be working with? > ");
		int userTotalNumber = keyboard.nextInt();
		System.out.println("Now, tell me the numbers! One by one please!");
		int FinalTotal = 0;
		
		for (int i = 0; i < userTotalNumber; i++) {
			System.out.print("> ");
			int userNumber = keyboard.nextInt();
			FinalTotal = FinalTotal + userNumber;
			//System.out.print(FinalTotal);
		}
		System.out.print("The average number is " + (FinalTotal / userTotalNumber));
	}
}
