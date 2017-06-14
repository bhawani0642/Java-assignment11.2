/*
 *  Program in java to divide any integer value with 0 (zero).

 */
package com.prienc;
//Importing the Scanner Class
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
	System.out.println("Enter a number");
	int a=sc.nextInt();
	int b=a/0;
	System.out.println("Print the result"+b);
	

	}

}
