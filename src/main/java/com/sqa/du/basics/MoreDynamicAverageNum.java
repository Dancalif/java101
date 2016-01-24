package com.sqa.du.basics;

import java.util.Scanner;

public class MoreDynamicAverageNum {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		boolean endFlag = false;
		int userTotalNumber = 0;
		int FinalTotal = 0;

		do {
			System.out.print("Number please. > ");
			int userNumber = keyboard.nextInt();
			userTotalNumber++;
			FinalTotal = FinalTotal + userNumber;
			System.out.println("The average number is " + (FinalTotal / userTotalNumber));
			System.out.print("Would you like to \"stop\" or \"add\" more numbers? > ");
			String userDecision = keyboard.next();
			if (userDecision.equalsIgnoreCase("stop")) {
				endFlag = true;
			}
		} while (endFlag == false);
	}
}
