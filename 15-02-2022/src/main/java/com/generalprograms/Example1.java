package com.generalprograms;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {


		int num1, num2, sum, sub, product, division, mode;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Value: ");
		num1 = scanner.nextInt();

		System.out.println("Enter Second Value: ");
		num2 = scanner.nextInt();

		//Sum of two numbers
		sum = num1+num2;
		System.out.println("Sum: "+sum);

		System.out.println("===========================");

		//Subtraction of two numbers
		sub = num1-num2;
		System.out.println("Sub: "+sub);

		System.out.println("===========================");

		//Product of two numbers
		product = num1*num2;
		System.out.println("Product: "+product);
		

		System.out.println("===========================");

		//Division of two numbers
		division = num1/num2;
		System.out.println("Division: "+division);
		
		System.out.println("===========================");

		//Mode of two numbers
		mode = num1%num2;
		System.out.println("Mode: "+mode);
	
	}

}
