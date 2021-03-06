package com.sqa.du.basics;

import java.util.Scanner;

public class CountingEvenNumsOnly {
	public static void main(String[] args) {
		// Create a Scanner object and assign to keyboard variable
		Scanner keyboard = new Scanner(System.in);
		// Request the end number for counting
		System.out.print("Number please to count from 0 to? > ");
		// Set user defined input to variable userInputNum
		int userInputNum = keyboard.nextInt();

		System.out.print("Let's make it a little more complicated!\n\n"
				+ "We will be counting only even numbers from 0 to " + userInputNum + ".\n");

		for (int i = 0; i <= userInputNum; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " / ");
			}
		}

		System.out.println("\n");

		System.out.print("Let's have more fun! And count only odd numbers from 0 to " + userInputNum + "!\n");
		// Looping through the numbers
		for (int b = 0; b <= userInputNum; b++) {
			// Checking if there are odd numbers using modulus
			if (b % 2 != 0) {
				System.out.print(b + " / ");
			}
		}
	}
}