package week3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		DisplayCalculator obj = new DisplayCalculator();
		
		Scanner userInput = new Scanner(System.in);
	  
		System.out.println("Enter your first number");
		int a = userInput.nextInt();
		
		System.out.println("Enter your second number");
		int b = userInput.nextInt();
		
		System.out.println("Choose any operator Sum, Sub, Multi , Div");
		String operator = userInput.next();
		
		switch (operator) {
		
		
		case "Sum":
			obj.sum(a, b);
			break;
		case "Sub":
			obj.sub(a, b);
			break;
		case "Multi":
			obj.multi(a, b);
			break;
		
		case "Div":
		obj.div(a, b);
			break;
		
		}
		
	
		
		
	}
		
		
		
		
	
		
		

	}	


