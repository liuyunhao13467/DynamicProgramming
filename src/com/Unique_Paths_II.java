package com;

public class Unique_Paths_II {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0){
        	return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int result[][] = new int[row][col];
        //init
        for(int i = 0; i < row; ++i){
        	for(int j = 0; j < col; ++j){
        		result[i][j] = 0;
        	}
        }
        //1st row
        for(int i = 0; i < col; ++i){
        	if(obstacleGrid[0][i] != 1){
        		result[0][i] = 1;
        	}else{
        		break;
        	}
        }
        //1st col
        for(int i = 0; i < row; ++i){
        	if(obstacleGrid[i][0] != 1){
        		result[i][0] = 1;
        	}else{
        		break;
        	}
        }
        for(int i = 1; i < row; ++i){
        	for(int j = 1; j < col; ++j){
        		//obstacle position
        		if(obstacleGrid[i][j] == 1){
        			result[i][j] = 0;
        		}else{
        			result[i][j] = result[i-1][j] + result[i][j-1];
        		}
        	}
        }
        return result[row-1][col-1];
    }
}
