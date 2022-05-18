package com.constructorChaning;

public class Example1 {


		//method communication
		public static void getText1()
		{
			System.out.println("Hello");
		}
		public static void getText2()
		{
			System.out.println("Hi");

			getText1();//getText2() method calling getText1() 
			
		}
		public static void main(String[] args) 
		{
			getText2();//main() method calling getText2() method

		
	}

}
