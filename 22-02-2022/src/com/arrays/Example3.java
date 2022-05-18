package com.arrays;

public class Example3 {

	public static void main(String[] args) {


		//Write a Java program to print all employees names using an array concept.
		
		String employeeNames[] = {"Sony", "Ammu", "Srinivas", "Pravalika", "Ravali"};
		
		System.out.println(employeeNames.length);
		System.out.println("================");
		
		for(String employeeName: employeeNames)
		{
			System.out.println(employeeName);
		}
	}

}
