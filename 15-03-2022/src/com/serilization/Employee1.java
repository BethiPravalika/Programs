package com.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Employee1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		try {
			FileInputStream fis = new FileInputStream("E:\\Javaprograms\\Employee.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
					Employee e = (Employee)in.readObject();
			System.out.println(e.id + " " + e.name + e.location);
		in.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
