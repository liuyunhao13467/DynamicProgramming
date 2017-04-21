package com;

public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] result = new int[row][col];
        //init
        for(int i = 0; i < row; i++){
        	for(int j = 0; j < col; ++j){
        		result[i][j] = 0;
        	}
        }
        result[0][0] = grid[0][0];
        //1st row
        for(int i = 1; i < col; ++i){
        	result[0][i] = grid[0][i] + result[0][i-1];
        }
        //1st col
        for(int j = 1; j < row; ++j){
        	result[j][0] = grid[j][0] + result[j-1][0];
        }
        for(int i = 1; i < row; ++i){
        	for(int j = 1; j < col; ++j){
        		result[i][j] = grid[i][j] + Math.min(result[i-1][j], result[i][j-1]);
        	}
        }
        return result[row-1][col-1];
    }
}
