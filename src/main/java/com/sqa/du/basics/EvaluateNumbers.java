/**
 * 
 */
package com.sqa.du.basics;

/**
 * @author dancalif
 *
 */
import java.util.Scanner;

public class EvaluateNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		java.util.Scanner keyboard = new Scanner(System.in);

		System.out.print("Please provide the number to compare it with 10. > ");
		int userNum = keyboard.nextInt();
		// Method to check the number that is passed as a parameter
		checkTheNum(userNum);
	}

	public static void checkTheNum(int userNum) {
		if (userNum > 10) {
			System.out.print("The number " + userNum + " is greater than 10.");
		} else if (userNum < 10) {
			System.out.print("The number " + userNum + "  is smaller than 10.");
		} else if (userNum == 10) {
			System.out.print("The numbers " + userNum + "  are equal.");
		}
	}
}
