#include <stdio.h>
#include <stdlib.h>

void bubblesort(int* array,int length);

int main(){
    int i;
    int array[] = {9, 89, 2, 5, 12, 1, 78, 76};

    int length = sizeof(array)/sizeof(array[0]);
    bubblesort(array, length);

    for(i = 0; i < length; i++)
        printf("%d ", array[i]);

}

void bubblesort(int* array, int length){

	int i, temp, j;

	for(i = 1; i <= length; i++){
        
        for(j = 0; j <=length-2;j++){

		if(array[j] > array[j+1]){
			temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
		}

        }
	}

    return;

}
