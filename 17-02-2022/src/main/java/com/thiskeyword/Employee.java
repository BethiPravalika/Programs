package com.thiskeyword;

public class Employee {

	//keyword: class fields/variables we can differentiate from parameters of constructors/methods
	
		//state(variables)
		int id;
		String name;
		double salary;
		String address;
		
		public Employee(int id, String name, double salary, String address) 
		{
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.address = address;
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
			
			Employee employee11 = new Employee(11, "Pravalika", 90383.34, "Pune");
			employee11.getInfo();
			
			System.out.println("================");
			
			Employee employee12 = new Employee(12, "Srinivas", 29383.84, "Hyderabad");
			employee12.getInfo();
			
			
	}

}
