package com.example.java.oops.array;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] grid = { // row
				{ 2, 3, 4, 5 }, // 0
				{ 6, 7, 8, 9 }, // 1
				{ 10, 11, 12, 13 }// 2
		};
		System.out.println(grid[2][2]);// 12

		int row, column;
		for (row = 0; row < grid.length; row++) {
			for (column = 0; column < grid[row].length; column++) {
				System.out.print(grid[row][column] + "\t");
			}
			System.out.println();
		}

		// string example
		String[][] animals = { { "cat", "cow", "crow" }, { "tiger", "lion", "eagle" },
				{ "goat", "chicken", "crocodile" } };
		System.out.println(animals[2][1]);
		
		int i,j;
		for(i=0;i<animals.length;i++) {
			for(j=0;j<animals[i].length;j++) {
				System.out.print(animals[i][j] + "\t");
			}
			System.out.println();
		}

		// another example
		String[][] texts = new String[2][3];
		texts[0][1] = "hello brother";
		System.out.println(texts[0][1]);

	}
}
