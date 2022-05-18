package com.constructorChaning;


public class Employee 
{

	//state(variables)
	int id;
	String name;
	double salary;
	String address;
	
	//default
	public Employee() 
	{
		this(11, "Ajay", 90383.34, "Pune");//default constructor is calling parameterized constructor
		id = 2020;
		name = "Kiran Reddy";
		salary = 89383.34;
		address = "Pune";
		System.out.println("Default");
	}
	
	
	//parameterized
	public Employee(int id, String name, double salary, String address) 
	{
		//Constructor call must be the first statement in a constructor
		//this();//parameterized constructor is calling default constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		System.out.println("Parameterized.");
	}

	//methods/behavior
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
	}
	
	public static void main(String[] args) 
	{
		Employee employee1 = new Employee();
				
		System.out.println("------------------------");
		
		Employee employee11 = new Employee(11, "Pravalika", 90383.34, "Pune");
    }
}
