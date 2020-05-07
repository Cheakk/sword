package com.sword.pra;

import java.util.ArrayList;

public class Pra10 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int row = 0;
        int column = 0;
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;
        // if (rows == 0 && columns == 0) {
        // return list;
        // }
        while (row <= rows && column <= columns) {
            println(matrix, row++, column++, rows--, columns--, list);
        }
        return list;
    }

    public void println(int[][] matrix, int row, int column, int rows, int columns, ArrayList<Integer> list) {
        // 考虑奇数列的情况
        if (row == rows) {
            for (int i = column; i <= columns; i++) {
                list.add(matrix[row][i]);
            }
        } else if (column == columns) {
            for (int i = row; i <= rows; i++) {
                list.add(matrix[i][column]);
            }
            // 考虑奇数行的情况
        } else {
            int x = column;
            int y = row;
            // 打印循环矩阵
            while (x != columns) {
                list.add(matrix[y][x]);
                x++;
            }
            while (y != rows) {
                list.add(matrix[y][x]);
                y++;
            }
            while (x != column) {
                list.add(matrix[y][x]);
                x--;
            }
            while (y != row) {
                list.add(matrix[y][x]);
                y--;
            }
        }
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };
         int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12,
         13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
//        int[][] matrix = { { 1, 2, 3, 4, 5 } };
        ArrayList<Integer> list = new ArrayList<>();
        Pra10 p = new Pra10();
        list = p.printMatrix(matrix);
        list.stream().forEach(Integer -> {
            System.out.println(Integer+"__");
        });
    }
}