package com.generalprograms;

import java.util.Scanner;

public class Example2 {
	
	static int num1,num2,sum,sub,product,division,mode;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void addition() {
		
		System.out.println("Enter first value: ");
		num1=scanner.nextInt();
		
		System.out.println("Enter second value: ");
		num2=scanner.nextInt();
		
		//Sum of two numbers
		sum=num1+num2;
		System.out.println("Sum: "  +sum);
		System.out.println();
		
	}
	public static void substraction() {
		
		System.out.println("Enter first value");
		num1=scanner.nextInt();
		
		System.out.println("Enter second value");
		num2=scanner.nextInt();
		
		//substraction of two numbers
		sub=num1+num2;
		System.out.println("Sub :" +sub);
		System.out.println();
	}

	public static void product() {
		
		System.out.println("Enter first value");
		num1=scanner.nextInt();
		
		System.out.println("Enter second value");
		num2=scanner.nextInt();
		
		//Product of two numbers
		product=num1*num2;
		System.out.println("Product: " +product);
		System.out.println();
	}
	
public static void division() {
		
		System.out.println("Enter first value");
		num1=scanner.nextInt();
		
		System.out.println("Enter second value");
		num2=scanner.nextInt();
		
		//Product of two numbers
		division=num1/num2;
		System.out.println("Division: " +division);
		System.out.println();
	}


public static void mode() {
	
	System.out.println("Enter first value");
	num1=scanner.nextInt();
	
	System.out.println("Enter second value");
	num2=scanner.nextInt();
	
	//Product of two numbers
	mode=num1%num2;
	System.out.println("Mode: " +mode);
	System.out.println();
}

	
	public static void main(String[] args) {

		while(true){
			
			System.out.println("********Operations Menu********");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3.Product");
			System.out.println("4. Division");
			System.out.println("5. Mode");
			System.out.println("6. Stop");
			
			System.out.println("Select valid operation");
			int operation= scanner.nextInt();
			
			switch(operation) 
			{
			case 1:
			               addition();
			                break;
			
			case 2:
	                            substraction();
	                             break;

			case 3:
	                             product();
	                             break;

			case 4:
	                             division();
	                             break;

			case 5:
	                            mode();
	                            break;

			case 6:
	                           System.exit(0);
	                           break;
	                
	       default :
	                         System.out.println("Select valid operation");

			}
			

			
		}
	}

}
