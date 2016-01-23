package com.sqa.du.basics;

import java.util.Scanner;

public class MonthSearch {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please provide the number of the month then I will tell you the name of the month. > ");
		int userMonthNum = keyboard.nextInt();
		boolean checkFlag = false;
		
		do {
		if (userMonthNum > 0 && userMonthNum <= 12) {
			
		switch (userMonthNum) {
		case 1:
			System.out.print("January");
			checkFlag = true;
			break;
		case 2:
			System.out.print("February");
			checkFlag = true;
			break;
		case 3:
			System.out.print("March");
			checkFlag = true;
			break;
		case 4:
			System.out.print("April");
			checkFlag = true;
			break;
		case 5:
			System.out.print("May");
			checkFlag = true;
			break;
		case 6:
			System.out.print("June");
			checkFlag = true;
			break;
		case 7:
			System.out.print("July");
			checkFlag = true;
			break;
		case 8:
			System.out.print("August");
			checkFlag = true;
			break;
		case 9:
			System.out.print("September");
			checkFlag = true;
			break;
		case 10:
			System.out.print("October");
			checkFlag = true;
			break;
		case 11:
			System.out.print("November");
			checkFlag = true;
			break;
		case 12:
			System.out.print("December");
			checkFlag = true;
			break;
		}
		} else {
			System.out.print("Please provide the number between 1 and 12. > ");
			userMonthNum = keyboard.nextInt();
		}
		} while (checkFlag == false);
	}
}
