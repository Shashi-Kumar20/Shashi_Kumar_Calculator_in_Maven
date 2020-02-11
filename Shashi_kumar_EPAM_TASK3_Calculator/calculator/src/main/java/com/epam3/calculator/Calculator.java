package com.epam3.calculator;
import java.util.Scanner;

public class Calculator {
	private static Scanner scanner = new Scanner(System.in);	
	private static int n1, n2, selection, res;
	
	public static void main(String[] args) {	//Open close principle100
		
		askInput();				
		
		askOperation();			
		
		performCalculation();		
		
		finalResult();			
		
		scanner.close();				

	}
	
	private static void finalResult() {
		
		System.out.println("Result = " + res);
		
	}

	private static void performCalculation() {
		
		switch(selection) {
			case 1:
				res = n1 + n2;
				break;
			case 2:
				res = n1 - n2;
				break;
			case 3:
				res = n1 * n2;
				break;
			case 4:					//Division by zero exception
				if( n2==0 ) {
					res = 0;
				} else {
					res = n1 / n2;
				}
				break;
			default:
				System.out.println("Invalid choice!---Choose correct operation");
		}
		
	}
	
	private static void askOperation() {
		
		System.out.println("Select an operation - ");
		System.out.println("1 - Addition");
		System.out.println("2 - Subraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		
		selection = scanner.nextInt();
	}
	
	private static void askInput() {	
		
		System.out.println("Enter 1st number: ");
		n1 = scanner.nextInt();
		
		System.out.println("Enter 2nd number: ");
		n2 = scanner.nextInt();
		
	}


}
