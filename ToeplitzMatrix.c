#include <stdio.h>
#include <stdlib.h>


	
bool isToeplitzMatrix(int** matrix, int matrixRowSize, int *matrixColSizes) {
    int count= 0, i, j;
    
    for(i = 1; i < matrixRowSize; i++){
        for(j = 1; j < matrixColSizes[i]; j++){
            if(matrix[i][j] != matrix[i-1][j-1])
                count++;
        }
    }
    
    if(count > 0)
        return false;
    else 
        return true;
    
}

