package com.sword.array;

import java.util.ArrayList;

/**
 * À≥ ±’Î¥Ú”°æÿ’Û
 * 
 * @author Administrator
 *
 */
public class PrintMatrix {

	public ArrayList<Integer> printMatrix(int[][] matrix) {
		int row = 0;
		int column = 0;
		int rows = matrix.length - 1;
		int columns = matrix[0].length - 1;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(row<=rows&&column<=columns) {
			print(row++, column++, rows--, columns--, result, matrix);
		}
		return result;
	}

	private void print(int row, int column, int rows, int columns, ArrayList<Integer> result, int[][] matrix) {
		if (row == rows) {
			for (int i = column; i <= columns; i++) {
				result.add(matrix[row][i]);
			}
		} else if (column == columns) {
			for (int i = row; i <= rows; i++) {
				result.add(matrix[i][column]);
			}
		} else {
			int rowIndex = row;
			int columnIndex = column;
			while (columnIndex < columns) {
				result.add(matrix[rowIndex][columnIndex]);
				columnIndex++;
			}
			while (rowIndex < rows) {
				result.add(matrix[rowIndex][columnIndex]);
				rowIndex++;
			}
			while (columnIndex > column) {
				result.add(matrix[rowIndex][columnIndex]);
				columnIndex--;
			}
			while (rowIndex > row) {
				result.add(matrix[rowIndex][columnIndex]);
				rowIndex--;
			}
		}

	}

	public static void main(String[] args) {
		PrintMatrix px = new PrintMatrix();
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		ArrayList<Integer> result = px.printMatrix(matrix);
		for (Integer in : result) {
			System.out.println(in);
		}
	}

}
