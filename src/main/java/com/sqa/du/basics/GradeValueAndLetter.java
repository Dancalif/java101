package com.sqa.du.basics;
import java.util.Scanner;

public class GradeValueAndLetter
{
	public static String gradeValue( double grade )
	{
		
		String gradeLetter = null;
		
		if (grade > 4.3){
			gradeLetter = "A+";
		} else if (grade > 4) {
			gradeLetter = "A";
		} else if ( grade > 3.7){
			gradeLetter = "A-";
		} else if (grade > 3.3 ){
			gradeLetter = "B+";
		} else if (grade > 3 ){
			gradeLetter = "B";
		} else if (grade > 2.7 ){
			gradeLetter = "B-";
		} else {
			gradeLetter = "F";
		}
		return gradeLetter;
	}


	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your grade value my friend? > ");
		double grade = keyboard.nextDouble();
		System.out.println( "Your grade letter is : " + gradeValue(grade));
	}
}