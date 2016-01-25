package com.sqa.du.basics;

import java.util.Scanner;

public class EmployeeHoursLog {
	public static void main(String[] args) {
		// Create a Scanner object and assign to keyboard variable
		Scanner keyboard = new Scanner(System.in);
		// Set boolean var for employee days validation loop
		boolean employeeDaysvalidation = false;
		// Create a set of vars to be able to calculate totals of empl hours,
		// regular hours and overtime hours
		int totalEmplHours = 0;
		int totalRegularHours = 0, totalRegularHours1 = 0, totalRegularHours2 = 0, totalRegularHours3 = 0;
		int totalOvertimeHours = 0, totalOvertimeHours1 = 0, totalOvertimeHours2 = 0, totalOvertimeHours3 = 0;
		// Set boolean var to exit the app
		boolean exitApp = false;
		// Greeting the user
		System.out.printf("%40s%S%s", "<<<<<Welcome to the ", "\"EmployeeHoursLog\"", " application.>>>>>\n");
		System.out.printf("%s",
				"         --------------------------------------------------------------------------\n");
		// Requesting login info to validate if user has the permission to enter
		// the app
		System.out.println("Please, provide your username and password below to login.");
		System.out.print("Username: ");
		String userNameInput = keyboard.nextLine();
		System.out.print("Password: ");
		String userPassInput = keyboard.nextLine();
		// Calling the method to validate if user has the permission to enter
		// the app
		UserLogin(userNameInput, userPassInput);
		// DO loop allows to enter multiple employees or escape the app
		do {
			// Requesting info about the name of employee and assign it to var
			System.out.print("\nWhat the current employee's name is? > ");
			String currentEmployee = keyboard.next();
			// Requesting info about the employee's hours and assign it to var
			System.out.print("How many days " + currentEmployee + " worked this week? > ");
			int employeeDays = keyboard.nextInt();
			// Error handler in validate a max number of days
			do {
				if (employeeDays > 7) {
					System.out
							.print(employeeDays + " is invalid number of days. 7 days is a max. Please try again. > ");
					employeeDays = keyboard.nextInt();
				} else if (employeeDays <= 7) {
					employeeDaysvalidation = true;
				}
			} while (employeeDaysvalidation != true);
			// Create an int array to store the hours per day
			int[] hoursArray = new int[employeeDays];

			System.out.println("Please tell me how many hours per day, one by one.\n");
			// The loop allows to assign hours into the array
			for (int i = 0; i <= employeeDays - 1; i++) {
				System.out.print("Day #" + (i + 1) + ": ");
				int emplHours = keyboard.nextInt();
				// Error handler to validate min and max values for hours
				while (emplHours > 24 || emplHours <= 0) {
					System.out.print(emplHours
							+ " is invalid number of hours. 24 hours is a max and 1 hour is a min. Please correct the number and enter again. > ");
					// Requesting the hours
					emplHours = keyboard.nextInt();
				}
				// Calculating the total of hours
				hoursArray[i] = emplHours;
				totalEmplHours = emplHours + totalEmplHours;
			}

			System.out
					.print("\n         --------------------------------------------------------------------------\n\n");
			// Creating the headers for the table: day #, total hours, regular
			// hours, overtime hours
			System.out.printf("%5S%12S%20S%22S", "day #", "hours", "regular hours", "overtime hours\n\n");
			// Looping through hours array to calculate regular hours and
			// overtime ones and fill out the table
			for (int i = 0; i <= hoursArray.length - 1; i++) {
				// Basically below is a logic that works with 3 scenarios: if
				// hours == 8; hours > 8; hours < 8
				// Each scenario has a little different approach to calculate
				// regular and overtime hours
				// First one: hours == 8
				if (hoursArray[i] == 8) {
					System.out.println("Day #" + (i + 1) + "   |   " + hoursArray[i] + "       |       " + hoursArray[i]
							+ "         |         " + 0);
					// Calculating regular hours and assign them to var
					totalRegularHours1 = hoursArray[i] + totalRegularHours;
					// Calculating overtime hours and assign them to var
					totalOvertimeHours1 = 0 + totalOvertimeHours1;
					// Second one: hours > 8
				} else if (hoursArray[i] > 8) {
					System.out.println("Day #" + (i + 1) + "   |   " + hoursArray[i] + "       |       " + 8
							+ "         |         " + (hoursArray[i] - 8));
					// Calculating regular hours and assign them to var
					totalRegularHours2 = 8 + totalRegularHours2;
					// Calculating overtime hours and assign them to var
					totalOvertimeHours2 = (hoursArray[i] - 8) + totalOvertimeHours2;
					// Third one: hours < 8
				} else if (hoursArray[i] < 8) {
					System.out.println("Day #" + (i + 1) + "   |   " + hoursArray[i] + "       |       " + hoursArray[i]
							+ "         |         " + 0);
					// Calculating regular hours and assign them to var
					totalRegularHours3 = hoursArray[i] + totalRegularHours3;
					// Calculating overtime hours and assign them to var
					totalOvertimeHours3 = 0 + totalOvertimeHours3;
				}

			}
			// Logic to calculate totals for regular and overtime hours and fill
			// them out into the table
			totalRegularHours = totalRegularHours1 + totalRegularHours2 + totalRegularHours3;
			totalOvertimeHours = totalOvertimeHours1 + totalOvertimeHours2 + totalOvertimeHours3;
			System.out.print("\n");
			System.out.print("TOTAL:   |   " + totalEmplHours + "       |       " + totalRegularHours
					+ "        |         " + totalOvertimeHours);
			System.out.print(
					"\n\n         --------------------------------------------------------------------------\n\n");
			// If user would like to continue working or exit the app
			System.out.print("Would you like to enter hours for another employee? (\"yes\" or \"no\" please). > ");
			// Getting a decision value and assign it to var
			String userNextEmpl = keyboard.next();
			// Validate the decision
			if (userNextEmpl.equalsIgnoreCase("no")) {
				// Flag to exit the appp
				exitApp = true;
				// Create farewell message
				System.out.print(
						"\n\n         --------------------------------------------------------------------------\n\n");
				System.out.printf("%40s%S%s", "<<<<<Thank you for using ", "\"EmployeeHoursLog\"",
						" application.>>>>>\n");
			}
			// Exit the app
		} while (exitApp == false);
	}

	//// Method to validate if user has the permission to enter the app
	public static void UserLogin(String userNameInput, String userPassInput) {
		// Vars to store the username and password
		String userNameSaved = "Dancalif";
		String userPassSaved = "12345";
		// Flag to exit a loop in login is successful
		boolean successLogin = false;
		// Loop in case if any entered values are wrong
		do {
			Scanner keyboard = new Scanner(System.in);
			if (userNameInput.equals(userNameSaved) && userPassInput.equals(userPassSaved)) {
				System.out.println("You have successfully logged in.");
				System.out.printf("%s",
						"         --------------------------------------------------------------------------\n");
				successLogin = true;
			} else {
				System.out.print("Username or password is incorrect. Please try again.\n");
				System.out.print("Username: ");
				userNameInput = keyboard.nextLine();
				System.out.print("Password: ");
				userPassInput = keyboard.nextLine();
			}
		} while (successLogin == false);

	}
}
