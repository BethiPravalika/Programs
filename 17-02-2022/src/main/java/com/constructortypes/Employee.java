package com.constructortypes;

//Constructors
public class Employee
{

	//state(variables)
	int id;
	String name;
	double salary;
	String address;
	
	/**
	 * Constructor:  constructor is a block, used  to intilialize object
	 * 
	 *1. Constructor name and class name is same
	 *2. Constructor do not have return type
	 *3. In java we have two types of constructors
	 *         => default/zero-parameterized constructor
	 *         => parameterized constructor
	 */
	
	public Employee()
	{
		
		id = 2021;
		name = "Pravalika";
		salary = 78689.35;
		address = "Pune";
	}
	
	
	public Employee(int id, String name, double salary, String address)
	{
		
		id = id;
		name = name;
		salary = salary;
		address = address;
		
	}


	//method behavior
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
		employee1.getInfo();
		//System.out.println(employee1.hashCode());

        System.out.println("============");
        
        Employee employee2 = new Employee();
        employee2.getInfo();
		//System.out.println(employee1.hashCode());

		System.out.println("- - - - - - - - - - - ");
		
		Employee employee11 = new Employee(11, "Srinivas", 90383.34, "Pune");
		employee11.getInfo();
		
		System.out.println("================");
		
		Employee employee12 = new Employee(12, "Pravalika", 29383.84, "Hyderabad");
		employee12.getInfo();
				
		
		
	}

}
