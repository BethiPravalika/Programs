package com.typesOfArrays;

public class Example4 {

	public static void main(String[] args) {


		//multidimensional array
		
		//multidimensional array in a single line(array declaration and initialization)
		
		int matrix[][] = {{2910, 2332}, {2902, 1181}};
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
				
			}
			
			System.out.println("\n\n\n");
		}	
	}

}
