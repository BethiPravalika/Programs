package com.typesOfArrays;

public class Example3 {

	public static void main(String[] args) {

		//multidimensional array
		//multidimensional array in a single line(array declaration and initilization)
		
		int matrix[][] = {{3920,4525}, {8524,5633}};
		
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix.length;j++) {
				System.out.println((matrix[i][j]));
			}
			
		}
		
		
	}

}
