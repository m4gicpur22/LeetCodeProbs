import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class MinimumPathSum {


public static int minPathSum(int grid[][], int gridRowSize, int gridColSize){

        int sum[][] = new int[gridColSize][gridRowSize];
        //initial value, top left of the grid
        sum[0][0] = grid[0][0];
        //looking forward it to be an M x N solution

        //we add horizontal value on the grid 
        for(int i =1; i < gridColSize; i++)
            sum[i][0] = grid[i][0] + sum[i-1][0];
        //we add vertial value on the grid
        for(int i = 1; i < gridRowSize; i++)
            sum[0][i] = grid[0][i] + sum[0][i-1];

        for(int i = 1; i < gridRowSize; i++){
            for(int j = 1; j < gridColSize; j++){
                //we decide everytime which value is the smaller value, horizontal or vetical
                sum[i][j] = minvalue(sum[i-1][j], sum[i][j-1]) + grid[i][j];      
        }
    }
    return sum[gridColSize-1][gridRowSize-1];
}

public static int minvalue(int a, int b)
{
    if(a < b)
        return a;
    else if(b < a)
        return b;

    return 0;

}


public static void main(String [] args){
    int gridarray[][] = { {1,3,1}, {1,5,1}, {4,2,1} };
    int rowSize = 3;
    int colSize = 3;

    System.out.println(minPathSum(gridarray, rowSize, colSize));

}


//my first attempt at implenting before looking at the solution
/* public static int minPathSum(int grid[][], int gridRowSize, int gridColSize){

        int minvalue = 10000000;
        int sum = 0;
        //initial value, top left of the grid
        sum[ = grid[0][0];
        //looking forward it to be an M x N solution

        for(int i = 1; i < gridRowSize; i++){
            for(int j = 1; j < gridColSize; j++){
                //navigate to one of the bottom indexs of the grid, must make sure to sum the values in the grid
                //can only move left or right, we cannot add values by going down diagonally
                if( i == (gridColsize - 1) && j == (gridRowsize - 1) )
                    break;
                else
                {   
                    sum = grid[i][j];
                    //in this case, we would go by: 1 + 3 + 1
                    //was going to give an out-of-bounds eror
                    if(grid[i+1][j] <= minvalue){
                        minvalue = grid[i+1][j];
                        sum += grid[i+1][j]; 
                    }  
                    else if(grid[i+1][j] <= minvalue ){
                        minvalue = grid[i][j+1];
                        sum += grid[i+1][j];
                    } 
                }
        }




    
    }
    return sum;
} 


*/














}